            package p000;

            import android.content.Context;
            import android.net.Uri;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.InputStream;
            import java.net.URLDecoder;
            import java.nio.charset.StandardCharsets;
            
            public final class O1oOI1oil0 extends Oll0io implements IlliIl1l11O {
                public final Uri I00iOIl;
                public final String I00iiI;
                public final long I00iiO;
                public final Context I00iio;
                public final I1i1OOi1iIo I00ilI0I1;
                public final O1i0lolo I00ilO0;
                public final O1l110o I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1oOI1oil0(Uri uri, String str, long j, Context context, I1i1OOi1iIo i1i1OOi1iIo, O1i0lolo o1i0lolo, O1l110o o1l110o, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = uri;
/* 3 */             this.I00iiI = str;
/* 5 */             this.I00iiO = j;
/* 7 */             this.I00iio = context;
/* 9 */             this.I00ilI0I1 = i1i1OOi1iIo;
/* 11 */            this.I00ilO0 = o1i0lolo;
/* 13 */            this.I00io1l = o1l110o;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            return new O1oOI1oil0(this.I00iOIl, this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 9 */             O1oOI1oil0 o1oOI1oil0 = (O1oOI1oil0) create((Ii0110) obj, (IOoil1iiIilo) obj2);
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            o1oOI1oil0.invokeSuspend(ooiIlOl1iI);
/* 37 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    long j;
                    long j2;
                    InputStream inputStream;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             Uri uri = this.I00iOIl;
/* 20 */            URLDecoder.decode(uri.toString(), StandardCharsets.UTF_8.name());
/* 25 */            Context context = this.I00iio;
/* 34 */            File file = new File(context.getExternalFilesDir(null), "__imports");
/* 41 */            if (!file.exists()) {
/* 43 */                file.mkdirs();
                    }
/* 48 */            File externalFilesDir = context.getExternalFilesDir(null);
/* 54 */            String str = this.I00iiI;
/* 60 */            File file2 = new File(externalFilesDir, "__imports/".concat(str));
/* 75 */            File file3 = new File(context.getExternalFilesDir(null), IlIi0I0.I000lI("__imports/", str, ".part"));
/* 80 */            FileOutputStream fileOutputStream = new FileOutputStream(file3);
/* 85 */            byte[] bArr = new byte[8192];
/* 91 */            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 95 */            I1i1OOi1iIo i1i1OOi1iIo = this.I00ilI0I1;
/* 97 */            O1i0lolo o1i0lolo = this.I00ilO0;
/* 99 */            long j3 = this.I00iiO;
/* 101 */           OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 103 */           if (inputStreamOpenInputStream != null) {
/* 105 */               j2 = 0;
/* 107 */               long j4 = 0;
/* 109 */               j = 0;
                        while (true) {
                            try {
/* 111 */                       int i = inputStreamOpenInputStream.read(bArr);
/* 116 */                       if (i == -1) {
                                    break;
                                }
/* 119 */                       fileOutputStream.write(bArr, 0, i);
/* 123 */                       j2 += i;
/* 124 */                       long jCurrentTimeMillis = System.currentTimeMillis();
/* 134 */                       if (jCurrentTimeMillis - j4 > 200) {
/* 138 */                           if (j3 != 0) {
/* 141 */                               inputStream = inputStreamOpenInputStream;
                                        try {
                                            try {
/* 150 */                                       i1i1OOi1iIo.invoke(new Float(j2 / j3));
                                            } catch (Exception e) {
/* 156 */                                       e = e;
/* 175 */                                       e.printStackTrace();
/* 178 */                                       file3.delete();
/* 181 */                                       String message = e.getMessage();
/* 185 */                                       if (message == null) {
/* 187 */                                           message = "Failed to import";
                                                }
/* 189 */                                       o1i0lolo.invoke(message);
/* 192 */                                       inputStream.close();
/* 195 */                                       fileOutputStream.close();
/* 198 */                                       return ooiIlOl1iI;
                                            }
                                        } catch (Throwable th) {
/* 154 */                                   th = th;
/* 199 */                                   inputStream.close();
/* 202 */                                   fileOutputStream.close();
/* 205 */                                   throw th;
                                        }
                                    } else {
/* 158 */                               inputStream = inputStreamOpenInputStream;
                                    }
/* 160 */                           inputStreamOpenInputStream = inputStream;
/* 162 */                           j4 = jCurrentTimeMillis;
                                }
                            } catch (Exception e2) {
/* 168 */                       e = e2;
/* 169 */                       inputStream = inputStreamOpenInputStream;
                            } catch (Throwable th2) {
/* 164 */                       th = th2;
/* 165 */                       inputStream = inputStreamOpenInputStream;
/* 199 */                       inputStream.close();
/* 202 */                       fileOutputStream.close();
/* 205 */                       throw th;
                            }
                        }
                    } else {
/* 206 */               j = 0;
/* 208 */               j2 = 0;
                    }
/* 172 */           InputStream inputStream2 = inputStreamOpenInputStream;
/* 211 */           if (inputStream2 != null) {
/* 213 */               inputStream2.close();
                    }
/* 216 */           fileOutputStream.close();
/* 221 */           if (j3 > j && j2 != j3) {
/* 227 */               file3.delete();
/* 257 */               o1i0lolo.invoke("Import incomplete: copied " + j2 + " of " + j3 + " bytes. Check free storage and try again.");
/* 260 */               return ooiIlOl1iI;
                    }
/* 265 */           if (file2.exists()) {
/* 267 */               file2.delete();
                    }
/* 274 */           if (file3.renameTo(file2)) {
/* 292 */               i1i1OOi1iIo.invoke(new Float(1.0f));
/* 297 */               this.I00io1l.invoke();
/* 437 */               return ooiIlOl1iI;
                    }
/* 276 */           file3.delete();
/* 281 */           o1i0lolo.invoke("Could not finalise imported file");
/* 284 */           return ooiIlOl1iI;
                }
            }
