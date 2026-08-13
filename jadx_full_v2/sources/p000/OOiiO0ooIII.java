            package p000;

            import java.io.IOException;
            import java.math.BigInteger;
            import java.security.KeyStoreException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.security.PrivateKey;
            import java.security.cert.CertificateEncodingException;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Iterator;
            
/* 4 */     public final class OOiiO0ooIII extends Oii0OIIO {
                public OOiiO0ooIII(OOiiO01O1lo oOiiO01O1lo) {
/* 49 */            throw null;
                }

                public static void I000OOo1O(StringBuilder sb, O0OIlO11l o0OIlO11l, X509Certificate x509Certificate, i01li0iOiO i01li0ioio) {
/* 1 */             i01liIOOI i01liiooi = o0OIlO11l.I00iOIl;
/* 3 */             BigInteger bigInteger = i01liiooi.I00iiO;
/* 5 */             if (bigInteger != null) {
/* 7 */                 BigInteger serialNumber = x509Certificate.getSerialNumber();
/* 20 */                String string = serialNumber != null ? serialNumber.toString(16) : "unknown";
/* 24 */                sb.append("serial-#: rid ");
/* 31 */                sb.append(bigInteger.toString(16));
/* 36 */                sb.append(" vs. cert ");
/* 39 */                sb.append(string);
/* 44 */                sb.append(" issuer: rid '");
/* 49 */                sb.append(i01liiooi.I00iiI);
/* 54 */                sb.append("' vs. cert '");
/* 72 */                sb.append(i01li0ioio == null ? "null" : i01lOO0li.I000o00OoI0I(i01li0ioio.I00iOIl.I00iiI.I00ilI0I1));
/* 77 */                sb.append("' ");
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(OIliiIOOiI1l oIliiIOOiI1l, IIOoIilO iIOoIilO, il0ilo0 il0ilo0Var) throws IOException {
                    byte[] bArrDigest;
                    OOiiIo0loolO oOiiIo0loolO;
/* 9 */             if (!(il0ilo0Var instanceof OOiiIo0loolO)) {
/* 544 */               IioIoO10iOiI.I000OOo1O("Provided decryption material is not compatible with the document - did you pass a null keyStore?");
/* 547 */               return;
                    }
/* 11 */            oIliiIOOiI1l.getClass();
/* 16 */            OIlOo0I1lIl oIlOo0I1lIlI0000oI00 = oIliiIOOiI1l.I0000oI00(IIi0I0I0o.I01I0Iioooo0);
/* 20 */            byte[] bArrI00000oIO = null;
/* 21 */            if (oIlOo0I1lIlI0000oI00 != null) {
/* 23 */                IIOoi0ooOoO iIOoi0ooOoO = oIlOo0I1lIlI0000oI00.I00iiI;
/* 25 */                IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I01o00iOi;
/* 33 */                if (iIOoi0ooOoO.I00oooO(iIi0I0I0o, null, 40) != 0) {
/* 40 */                    this.I00000oIO = (short) iIOoi0ooOoO.I00oooO(iIi0I0I0o, null, 40);
/* 44 */                    IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(IIi0I0I0o.I01O1lIi);
/* 58 */                    this.I0000O = iIOoOiOII00oII instanceof IIOoOl1o1 ? ((IIOoOl1o1) iIOoOiOII00oII).I00iOIl : true;
                        } else if (oIliiIOOiI1l.I000II() != 0) {
/* 72 */                    this.I00000oIO = (short) oIliiIOOiI1l.I000II();
/* 78 */                    this.I0000O = oIliiIOOiI1l.I000iOII();
                        }
                    }
/* 80 */            OOiiIo0loolO oOiiIo0loolO2 = (OOiiIo0loolO) il0ilo0Var;
                    try {
/* 82 */                X509Certificate x509CertificateI00000oIO = oOiiIo0loolO2.I00000oIO();
/* 98 */                i01li0iOiO i01li0ioio = x509CertificateI00000oIO != null ? new i01li0iOiO(x509CertificateI00000oIO.getEncoded()) : null;
/* 101 */               IIOoi0ooOoO iIOoi0ooOoO2 = (IIOoi0ooOoO) oIliiIOOiI1l.I00iiI;
/* 103 */               IIi0I0I0o iIi0I0I0o2 = IIi0I0I0o.I0I1oi;
/* 105 */               IIOoIilO iIOoIilOI00lli11 = iIOoi0ooOoO2.I00lli11(iIi0I0I0o2);
/* 109 */               if (iIOoIilOI00lli11 == null && oIlOo0I1lIlI0000oI00 != null) {
/* 115 */                   iIOoIilOI00lli11 = oIlOo0I1lIlI0000oI00.I00iiI.I00lli11(iIi0I0I0o2);
                        }
/* 119 */               if (iIOoIilOI00lli11 == null) {
/* 520 */                   throw new IOException("/Recipients entry is missing in encryption dictionary");
                        }
/* 121 */               ArrayList arrayList = iIOoIilOI00lli11.I00iOIl;
/* 123 */               int size = arrayList.size();
/* 127 */               byte[][] bArr = new byte[size][];
/* 131 */               StringBuilder sb = new StringBuilder();
/* 136 */               int i = 0;
/* 137 */               boolean z = false;
/* 138 */               int length = 0;
/* 144 */               while (i < arrayList.size()) {
/* 152 */                   byte[] bArr2 = ((IIi0l1) iIOoIilOI00lli11.I00lll10(i)).I00iOIl;
/* 161 */                   OOloOo11 oOloOo11 = (OOloOo11) new O1OIll00i(bArr2).I00iiI;
/* 163 */                   oOloOo11.getClass();
/* 173 */                   Iterator it = new ArrayList(oOloOo11.I00iOIl).iterator();
/* 177 */                   int i2 = 0;
                            while (true) {
/* 182 */                       if (!it.hasNext()) {
/* 256 */                           oOiiIo0loolO = oOiiIo0loolO2;
                                    break;
                                }
/* 188 */                       Iterator it2 = it;
/* 192 */                       OOloOo oOloOo = (OOloOo) it.next();
/* 194 */                       oOiiIo0loolO = oOiiIo0loolO2;
/* 196 */                       OOlo10O1I1IO oOlo10O1I1IO = oOloOo.I00000oIO;
/* 198 */                       if (!z && oOlo10O1I1IO.I00Io1lO(i01li0ioio)) {
/* 221 */                           z = true;
/* 217 */                           bArrI00000oIO = oOloOo.I00000oIO(new OillOo0((PrivateKey) oOiiIo0loolO.I00000oOI()));
                                    break;
                                }
/* 225 */                       i2++;
/* 227 */                       if (x509CertificateI00000oIO != null) {
/* 231 */                           sb.append('\n');
/* 234 */                           sb.append(i2);
/* 239 */                           sb.append(": ");
/* 244 */                           if (oOlo10O1I1IO instanceof O0OIlO11l) {
/* 248 */                               I000OOo1O(sb, (O0OIlO11l) oOlo10O1I1IO, x509CertificateI00000oIO, i01li0ioio);
                                    }
                                }
/* 251 */                       oOiiIo0loolO2 = oOiiIo0loolO;
/* 253 */                       it = it2;
                            }
/* 258 */                   bArr[i] = bArr2;
/* 261 */                   length += bArr2.length;
/* 263 */                   i++;
/* 267 */                   oOiiIo0loolO2 = oOiiIo0loolO;
                        }
/* 271 */               if (!z || bArrI00000oIO == null) {
/* 512 */                   throw new IOException("The certificate matches none of " + arrayList.size() + " recipient entries" + sb.toString());
                        }
/* 278 */               if (bArrI00000oIO.length != 24) {
/* 473 */                   throw new IOException("The enveloped data does not contain 24 bytes");
                        }
/* 281 */               byte[] bArr3 = new byte[4];
/* 283 */               int length2 = 20;
/* 286 */               System.arraycopy(bArrI00000oIO, 20, bArr3, 0, 4);
/* 291 */               Il1IIl1 il1IIl1 = new Il1IIl1(bArr3);
/* 294 */               boolean z2 = true;
/* 296 */               il1IIl1.I00000oOI = true;
/* 298 */               this.I000II = il1IIl1;
/* 300 */               int i3 = length + 20;
/* 302 */               byte[] bArr4 = new byte[i3];
/* 304 */               int i4 = 0;
/* 305 */               System.arraycopy(bArrI00000oIO, 0, bArr4, 0, 20);
/* 308 */               int i5 = 0;
/* 309 */               while (i5 < size) {
/* 311 */                   byte[] bArr5 = bArr[i5];
/* 314 */                   System.arraycopy(bArr5, i4, bArr4, length2, bArr5.length);
/* 318 */                   length2 += bArr5.length;
/* 319 */                   i5++;
/* 321 */                   i4 = 0;
                        }
/* 329 */               if (oIliiIOOiI1l.I000OiO() == 4 || oIliiIOOiI1l.I000OiO() == 5) {
/* 357 */                   if (!this.I0000O) {
/* 359 */                       int i6 = length + 24;
/* 361 */                       byte[] bArr6 = new byte[i6];
/* 368 */                       System.arraycopy(bArr4, 0, bArr6, 0, Math.min(i3, i6));
/* 376 */                       System.arraycopy(new byte[]{-1, -1, -1, -1}, 0, bArr6, i3, 4);
/* 379 */                       bArr4 = bArr6;
                            }
/* 384 */                   if (oIliiIOOiI1l.I000OiO() == 4) {
                                try {
/* 390 */                           bArrDigest = MessageDigest.getInstance("SHA-1").digest(bArr4);
                                } catch (NoSuchAlgorithmException e) {
/* 401 */                           throw new RuntimeException(e);
                                }
                            } else {
                                try {
/* 408 */                           bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr4);
                                } catch (NoSuchAlgorithmException e2) {
/* 465 */                           throw new RuntimeException(e2);
                                }
                            }
/* 412 */                   if (oIlOo0I1lIlI0000oI00 != null) {
/* 422 */                       IIi0I0I0o iIi0I0I0o3 = (IIi0I0I0o) oIlOo0I1lIlI0000oI00.I00iiI.I00oII(IIi0I0I0o.I010i10l);
/* 430 */                       if (!IIi0I0I0o.I00io1l.equals(iIi0I0I0o3) && !IIi0I0I0o.I00ioIO.equals(iIi0I0I0o3)) {
/* 441 */                           z2 = false;
                                }
/* 442 */                       this.I0001Ioi1lo = z2;
                            }
                        } else {
                            try {
/* 343 */                       bArrDigest = MessageDigest.getInstance("SHA-1").digest(bArr4);
                            } catch (NoSuchAlgorithmException e3) {
/* 354 */                       throw new RuntimeException(e3);
                            }
                        }
/* 444 */               short s = this.I00000oIO;
/* 448 */               byte[] bArr7 = new byte[s / 8];
/* 450 */               this.I00000oOI = bArr7;
/* 455 */               System.arraycopy(bArrDigest, 0, bArr7, 0, s / 8);
                    } catch (IIOlio1ol e4) {
/* 541 */               throw new IOException(e4);
                    } catch (KeyStoreException e5) {
/* 534 */               throw new IOException(e5);
                    } catch (CertificateEncodingException e6) {
/* 527 */               throw new IOException(e6);
                    }
                }

/* 5 */         public OOiiO0ooIII() {
                }
            }
