            package p000;

            import java.security.GeneralSecurityException;
            import java.security.InvalidKeyException;
            import java.security.NoSuchAlgorithmException;
            import java.security.NoSuchProviderException;
            import java.security.SignatureException;
            import java.security.cert.CertificateException;
            import java.security.cert.X509Certificate;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import javax.net.ssl.SSLPeerUnverifiedException;
            
            public final class I1oi1O010i extends iOl11OooolI0 {
                public I1ooiIoI I00000oIO;

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final List I00000oIO(String str, List list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
/* 5 */             ArrayDeque arrayDeque = new ArrayDeque(list);
/* 10 */            ArrayList arrayList = new ArrayList();
/* 17 */            arrayList.add(arrayDeque.removeFirst());
/* 21 */            boolean z = false;
/* 24 */            for (int i = 0; i < 9; i++) {
/* 31 */                X509Certificate x509Certificate = (X509Certificate) IIl001iO0Io.I000OiO(1, arrayList);
/* 45 */                Set set = (Set) this.I00000oIO.I00000oIO.get(x509Certificate.getIssuerX500Principal());
/* 47 */                X509Certificate x509Certificate2 = null;
/* 48 */                if (set != null) {
/* 53 */                    Iterator it = set.iterator();
                            while (true) {
/* 61 */                        if (!it.hasNext()) {
                                    break;
                                }
/* 63 */                        Object next = it.next();
                                try {
/* 74 */                            x509Certificate.verify(((X509Certificate) next).getPublicKey());
/* 77 */                            x509Certificate2 = next;
                                    break;
                                } catch (Exception unused) {
                                }
                            }
/* 78 */                    x509Certificate2 = x509Certificate2;
                        }
/* 80 */                if (x509Certificate2 == null) {
/* 122 */                   Iterator it2 = arrayDeque.iterator();
/* 130 */                   while (it2.hasNext()) {
/* 136 */                       X509Certificate x509Certificate3 = (X509Certificate) it2.next();
/* 150 */                       if (O0000Ioio00.I0000O(x509Certificate.getIssuerDN(), x509Certificate3.getSubjectDN())) {
                                    try {
/* 157 */                               x509Certificate.verify(x509Certificate3.getPublicKey());
/* 160 */                               it2.remove();
/* 163 */                               arrayList.add(x509Certificate3);
                                    } catch (GeneralSecurityException unused2) {
                                        continue;
                                    }
                                }
                            }
/* 170 */                   if (!z) {
/* 192 */                       throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                            }
/* 172 */                   return arrayList;
                        }
/* 86 */                if (arrayList.size() > 1 || !x509Certificate.equals(x509Certificate2)) {
/* 94 */                    arrayList.add(x509Certificate2);
                        }
/* 109 */               if (O0000Ioio00.I0000O(x509Certificate2.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                            try {
/* 116 */                       x509Certificate2.verify(x509Certificate2.getPublicKey());
/* 172 */                       return arrayList;
                            } catch (GeneralSecurityException unused3) {
                            }
                        }
/* 120 */               z = true;
                    }
/* 551 */           throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 20 */                return true;
                    }
                    return (obj instanceof I1oi1O010i) && ((I1oi1O010i) obj).I00000oIO.equals(this.I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
