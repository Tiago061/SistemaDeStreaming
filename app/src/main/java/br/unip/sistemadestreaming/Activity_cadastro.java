package br.unip.sistemadestreaming;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });




        EditText edtNomeUsuario = findViewById(R.id.editTextNomeUsuario);
        EditText edtEmailAddress = findViewById(R.id.editTextEmailAddress);
        EditText edtSenha = findViewById(R.id.editTextPassword);
        EditText edtTelefone = findViewById(R.id.editTextPhone);
        Button btnCadastrar = findViewById(R.id.buttonCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = edtNomeUsuario.getText().toString();
                String email = edtEmailAddress.getText().toString();
                String senha = edtSenha.getText().toString();
                String telefone = edtTelefone.getText().toString();

                if(!usuario.isEmpty() && !email.isEmpty() && !senha.isEmpty() && !telefone.isEmpty()){
                    SharedPreferences sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();

                    editor.putString("usuario", usuario);
                    editor.putString("email", email);
                    editor.putString("senha", senha);
                    editor.putString("telefone", telefone);
                    editor.apply();
                    Toast.makeText(Activity_cadastro.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
                    finish();
                }else {
                    Toast.makeText(Activity_cadastro.this, "Por favor, preencha todos os campos!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}