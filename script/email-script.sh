echo "Instalando mailutils..."
sudo apt-get install mailutils
echo "Instalação completa"

$email = $EMAIL
echo $email
echo "Mandando e-mail com o mail do linux" | mail -s "subject: Atividade CICD" email

