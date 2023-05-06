package com.example.gadgethab;

import com.example.gadgethab.Models.Tovar;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class Recomendation {

//    public static final String COL_NAME="Buy";
//
//    public String saveTovarDetails(Tovar tovar) throws InterruptedException, ExecutionException {
//        Firestore dbFirestore = FirestoreClient.getFirestore();
//        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(tovar.getName()).set(tovar);
//        return collectionsApiFuture.get().getUpdateTime().toString();
//    }
//
//    public Tovar getTovarDetails(String name) throws InterruptedException, ExecutionException {
//        FirebaseDatabase db = FirebaseDatabase.getInstance();
//        DatabaseReference ref = db.getReference(COL_NAME).get();
//        ApiFuture<DocumentSnapshot> future = ref;
//
//        DocumentSnapshot document = future.get();
//
//        Tovar tovar = null;
//
//        if(document.exists()) {
//            tovar = document.toObject(Tovar.class);
//            return tovar;
//        }else {
//            return null;
//        }
//    }
//
//    public String updateTovarDetails(Tovar tovar) throws InterruptedException, ExecutionException {
//        Firestore dbFirestore = FirestoreClient.getFirestore();
//        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(tovar.getName()).set(tovar);
//        return collectionsApiFuture.get().getUpdateTime().toString();
//    }
//
//    public String deletePatient(String name) {
//        Firestore dbFirestore = FirestoreClient.getFirestore();
//        ApiFuture<WriteResult> writeResult = dbFirestore.collection(COL_NAME).document(name).delete();
//        return "Document with Patient ID "+name+" has been deleted";
//    }
}
