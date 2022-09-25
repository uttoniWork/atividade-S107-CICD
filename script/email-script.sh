ls
cd src
echo "Instalando mailutils..."
sudo apt-get install mailutils
echo "Instalação completa"

EMAIL = $EMAIL

echo $EMAIL
echo "Pipeline executado com sucesso" | mail -s "subject: Atividade CICD" "$EMAIL"

