ls
cd src
echo "Instalando mailutils..."
sudo apt-get install mailutils
echo "Instalação completa"

EMAIL = $EMAIL

echo $EMAIL
echo "Mandando e-mail com o mail do linux" | mail -s "subject: Atividade CICD" "$EMAIL"

