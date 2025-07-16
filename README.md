# 🗳️ Kubernetes Microservices Voting App

This project is a Kubernetes-based deployment of the classic **Docker Voting App**. It demonstrates how to run a microservices-based application on Kubernetes using Deployments and Services.

## 📦 Microservices Overview

The application consists of 5 components:

- **Vote** – Frontend voting app (Node.js)
- **Result** – Frontend result app (Python Flask)
- **Worker** – Background processor that moves votes from Redis to Postgres
- **Redis** – In-memory data store for vote queue
- **Postgres** – Database for storing votes

> ⚠️ I did not build these apps. They are from [dockersamples/example-voting-app](https://github.com/dockersamples/example-voting-app).  
> I built the Kubernetes deployment architecture around them.

## 🧠 What I Learned

- Deploying microservices on Kubernetes using Minikube
- Writing and organizing Deployment and Service YAMLs
- Using labels and selectors to connect resources
- Working with ClusterIP and NodePort services
- Managing multi-container apps efficiently using manifests

## 🔧 Tech Stack

- Kubernetes (Minikube)
- Docker
- Redis, Postgres
- Node.js, Flask
- YAML for K8s configs

## 🚀 How to Run Locally

> This app runs locally on Minikube using NodePort services. It is **not exposed to the internet**.

1. Start Minikube:

   minikube start

2. Apply the Kubernetes manifests:
   kubectl apply: -f services/ && kubectl apply -f deployments/

3. Access the services:
   minikube service vote
   minikube service result

## 🚀project structure
.
├── deployments/     # Deployment YAMLs (vote, result, worker, redis, db)
├── services/        # Service YAMLs (NodePort & ClusterIP)
├── legacy-pods/     # Old individual pod files (before switching to Deployments)
└── README.md

