package com.hireapro.worker.service;

import net.devh.boot.grpc.server.service.GrpcService;

import com.hireapro.worker.WorkerRequest;
import com.hireapro.worker.WorkerResponse;
import com.hireapro.worker.WorkerServiceGrpc;

import io.grpc.stub.StreamObserver;

@GrpcService
public class WorkerService extends WorkerServiceGrpc.WorkerServiceImplBase {

	@Override
	public void getWorker(WorkerRequest request, StreamObserver<WorkerResponse> responseObserver) {

		// We have mocked the emplyee data.
		// Need to replace with repository and db Data
		WorkerResponse workerResp = WorkerResponse.newBuilder().setWorkerId(request.getWorkerId())
				.setName("Test worker name").build();
		responseObserver.onNext(workerResp);
		responseObserver.onCompleted();
	}
}
