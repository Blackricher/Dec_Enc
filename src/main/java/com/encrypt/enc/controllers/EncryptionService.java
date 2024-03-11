//package com.encrypt.enc.controllers;
//
//import java.net.URLDecoder;
//import java.net.URLEncoder;
//import java.util.Base64;
//import javax.crypto.spec.SecretKeySpec;
//import javax.crypto.KeyGenerator;
//import javax.crypto.SecretKey;
//import javax.crypto.Cipher;
//import javax.crypto.spec.IvParameterSpec;
//
//
//import org.springframework.util.Base64Utils;
//
//public interface EncryptionService {
//
//    String decrypt(String text, String key) throws Exception;
//
//    String encrypt(String text, String key) throws Exception;
//    
//	class Method1EncryptionService implements EncryptionService {
//		
//		public String decrypt1(String text, String key) throws Exception {
//        
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        byte[] keyBytes= new byte[16];
//        byte[] b= key.getBytes("UTF-8");
//        int len= b.length;
//        if (len > keyBytes.length) len = keyBytes.length;
//        System.arraycopy(b, 0, keyBytes, 0, len);
//        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
//        IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
//        cipher.init(Cipher.DECRYPT_MODE,keySpec,ivSpec);
//
//        //BASE64Decoder decoder = new BASE64Decoder();
//        
//        byte [] results = Base64.getDecoder().decode(text);
//        return new String(results,"UTF-8");
//    }
//    
//    
//    public String encrypt1(String text, String key) throws Exception {
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        byte[] keyBytes= new byte[16];
//        byte[] b= key.getBytes("UTF-8");
//        int len= b.length;
//        if (len > keyBytes.length) len = keyBytes.length;
//        System.arraycopy(b, 0, keyBytes, 0, len);
//        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
//        IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
//        cipher.init(Cipher.ENCRYPT_MODE,keySpec,ivSpec);
//        
//        byte[] results = cipher.doFinal(text.getBytes("UTF-8"));
//        
//        //BASE64Encoder encoder = new BASE64Encoder();
//        return Base64.getEncoder().encodeToString(text.getBytes());
//    }
//	}
//	class Method2EncryptionService implements EncryptionService {
//		
//	
//    private String key = "UaTAgriStack"; // Replace this with your actual secret key
//
//    
//    public String decrypt2(String text, String key) throws Exception {
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        byte[] keyBytes = new byte[16];
//        byte[] b = key.getBytes("UTF-8");
//        int len = b.length;
//        if (len > keyBytes.length)
//            len = keyBytes.length;
//        System.arraycopy(b, 0, keyBytes, 0, len);
//        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
//        IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
//        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
//
//        // URL decode the encrypted value before decryption
//        String decodedText = URLDecoder.decode(text, "UTF-8");
//        byte[] decodedBytes = Base64Utils.decode(decodedText.getBytes("UTF-8"));
//        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
//        return new String(decryptedBytes, "UTF-8");
//    }
//
//    
//    public String encrypt2(String text, String key) throws Exception {
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        byte[] keyBytes = new byte[16];
//        byte[] b = key.getBytes("UTF-8");
//        int len = b.length;
//        if (len > keyBytes.length)
//            len = keyBytes.length;
//        System.arraycopy(b, 0, keyBytes, 0, len);
//        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
//        IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
//        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
//
//        byte[] encryptedBytes = cipher.doFinal(text.getBytes("UTF-8"));
//
//        // URL encode the encrypted value
//        //Base64.getUrlEncoder() method instead of Base64Utils.encodeToString()
//        String urlEncodedString = URLEncoder.encode(Base64Utils.encodeToString(encryptedBytes), "UTF-8");
//
//       return urlEncodedString;
//   }
//
//
//
//   public void setKey(String key) {
//       this.key = key;
//    }
//}
//}
