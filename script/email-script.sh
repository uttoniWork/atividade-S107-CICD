echo "Instalando mailutils..."
sudo apt-get install mailutils
sudo "Instalação completa"

$email = $EMAIL

echo "Mandando e-mail com o mail do linux" | mail -s "subject: Atividade CICD" email

