
ve to repo root
cd ~/projects/k8s-playground/Voteing_App/deployment-arch || exit

# Create folders
mkdir -p deployments services legacy-pods

# Move Deployment files
mv *-dep.yaml deployments/
mv vote-deployment.yaml deployments/vote-dep.yaml

# Move Service files
mv *-service.yaml services/

# Move legacy Pod YAMLs (from parent directory)
mv ../*-pod.yaml legacy-pods/
mv ../result-app-pod.yaml legacy-pods/
mv ../vote-service.yaml services/ 2>/dev/null

# Git add & commit
git add .
git commit -m "Organized files into deployments, services, and legacy-pods folders"

