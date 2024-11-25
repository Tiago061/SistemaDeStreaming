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

public class Activity_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText edtEmail = findViewById(R.id.editTextEmail);
        EditText edtSenha = findViewById(R.id.editTextSenha);
        Button btnLogin = findViewById(R.id.btnAcessar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                String savedEmail = sharedPreferences.getString("email", "");
                String savedSenha = sharedPreferences.getString("senha", "");

                String email = edtEmail.getText().toString();
                String senha = edtSenha.getText().toString();

                if(email.equals(savedEmail) && senha.equals(savedSenha)){
                    Toast.makeText(Activity_Login.this,"Login realizado com sucesso!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Activity_Login.this,"Email ou senha incorretos!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}