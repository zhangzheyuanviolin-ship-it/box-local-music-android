            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.zip.GZIPOutputStream;
            
/* 27 */    public final class l0I0Ii1OIi0 implements Runnable {
                public final int I00iOIl = 0;
                public final URL I00iiI;
                public final byte[] I00iiO;
                public final String I00iio;
                public final Map I00ilI0I1;
                public final Object I00ilO0;
                public final I01O1lIi I00io1l;

                public l0I0Ii1OIi0(l0I1IOo l0i1ioo, String str, URL url, byte[] bArr, Map map, l01lllOO0 l01llloo0) {
/* 7 */             Objects.requireNonNull(l0i1ioo);
/* 10 */            this.I00io1l = l0i1ioo;
/* 12 */            lII0I0I000I.I0000O(str);
/* 15 */            lII0I0I000I.I000II(url);
/* 18 */            this.I00iiI = url;
/* 20 */            this.I00iiO = bArr;
/* 22 */            this.I00ilO0 = l01llloo0;
/* 24 */            this.I00iio = str;
/* 26 */            this.I00ilI0I1 = map;
                }

                public void I00000oIO(int i, IOException iOException, byte[] bArr, Map map) {
/* 9 */             l0o10OoO0 l0o10ooo0 = ((l0olllO1i) ((lIloiI) this.I00io1l).I00iOIl).I00io1l;
/* 11 */            l0olllO1i.I000II(l0o10ooo0);
/* 17 */            iili1oo1o iili1oo1oVar = new iili1oo1o(4);
/* 20 */            iili1oo1oVar.I00iiO = this;
/* 22 */            iili1oo1oVar.I00iiI = i;
/* 24 */            iili1oo1oVar.I00iio = iOException;
/* 26 */            iili1oo1oVar.I00ilI0I1 = bArr;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            l0o10ooo0.I010o0o0oO(iili1oo1oVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:164:0x02be  */
                /* JADX WARN: Removed duplicated region for block: B:174:0x02f8  */
                /* JADX WARN: Removed duplicated region for block: B:178:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:182:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:190:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:192:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:194:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:208:0x00fb A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00f5 A[Catch: all -> 0x00f9, LOOP:0: B:40:0x00ef->B:42:0x00f5, LOOP_END, TryCatch #11 {all -> 0x00f9, blocks: (B:39:0x00ed, B:40:0x00ef, B:42:0x00f5, B:45:0x00fb), top: B:184:0x00ed }] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0154  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v10 */
                /* JADX WARN: Type inference failed for: r6v8 */
                /* JADX WARN: Type inference failed for: r6v9 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() throws Throwable {
                    Throwable th;
                    int responseCode;
                    HttpURLConnection httpURLConnection;
                    Map map;
                    IOException iOException;
                    HttpURLConnection httpURLConnection2;
                    Map map2;
                    l010iooill10 l010iooill10Var;
                    l0o10OoO0 l0o10ooo0;
                    URLConnection uRLConnectionOpenConnection;
                    Map<String, List<String>> headerFields;
                    InputStream inputStream;
                    ByteArrayOutputStream byteArrayOutputStream;
                    byte[] bArr;
                    Throwable th2;
                    OutputStream outputStream;
                    HttpURLConnection httpURLConnection3;
                    Map map3;
                    IOException iOException2;
                    OutputStream outputStream2;
                    HttpURLConnection httpURLConnection4;
                    Map map4;
                    URLConnection uRLConnectionOpenConnection2;
                    Map map5;
                    ?? r6;
                    int responseCode2;
                    Map map6;
                    InputStream inputStream2;
                    ByteArrayOutputStream byteArrayOutputStream2;
                    byte[] bArr2;
                    int i;
/* 3 */             int i2 = this.I00iOIl;
/* 9 */             ?? r5 = "Content-Encoding";
/* 13 */            byte[] bArr3 = this.I00iiO;
/* 15 */            Map map7 = this.I00ilI0I1;
/* 23 */            URL url = this.I00iiI;
/* 25 */            I01O1lIi i01O1lIi = this.I00io1l;
/* 27 */            int i3 = 0;
/* 29 */            String str = this.I00iio;
                    switch (i2) {
                        case 0:
/* 385 */                   OutputStream outputStream3 = null;
/* 391 */                   l01lllOO0 l01llloo0 = (l01lllOO0) this.I00ilO0;
/* 393 */                   l0I1IOo l0i1ioo = (l0I1IOo) i01O1lIi;
/* 397 */                   l0olllO1i l0olllo1i = (l0olllO1i) l0i1ioo.I00iOIl;
/* 401 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) l0i1ioo.I00iOIl;
/* 403 */                   l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 405 */                   l0olllO1i.I000II(l0o10ooo02);
/* 408 */                   l0o10ooo02.I010ioo();
                            try {
/* 411 */                       uRLConnectionOpenConnection = url.openConnection();
                            } catch (IOException e) {
/* 730 */                       iOException = e;
/* 732 */                       responseCode = 0;
/* 734 */                       httpURLConnection2 = null;
/* 736 */                       map2 = null;
                            } catch (Throwable th3) {
/* 673 */                       th = th3;
/* 674 */                       responseCode = 0;
/* 676 */                       httpURLConnection = null;
/* 678 */                       map = null;
                            }
/* 417 */                   if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
/* 672 */                       throw new IOException("Failed to obtain HTTP connection");
                            }
/* 420 */                   httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
/* 422 */                   httpURLConnection2.setDefaultUseCaches(false);
/* 425 */                   iIl1iil iil1iil = l0olllo1i2.I00iio;
/* 427 */                   httpURLConnection2.setConnectTimeout(60000);
/* 430 */                   httpURLConnection2.setReadTimeout(61000);
/* 433 */                   httpURLConnection2.setInstanceFollowRedirects(false);
/* 437 */                   httpURLConnection2.setDoInput(true);
/* 440 */                   if (map7 != null) {
                                try {
/* 454 */                           for (Map.Entry entry : map7.entrySet()) {
/* 474 */                               httpURLConnection2.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                } catch (IOException e2) {
/* 658 */                           iOException = e2;
/* 660 */                           responseCode = 0;
/* 651 */                           map2 = null;
/* 738 */                           if (outputStream3 != null) {
                                    }
/* 759 */                           if (httpURLConnection2 != null) {
                                    }
/* 764 */                           l0o10ooo0 = l0olllo1i2.I00io1l;
/* 766 */                           l0olllO1i.I000II(l0o10ooo0);
/* 777 */                           l010iooill10Var = new l010iooill10(this.I00iio, l01llloo0, responseCode, iOException, null, map2);
/* 621 */                           l0o10ooo0.I010o0o0oO(l010iooill10Var);
/* 782 */                           return;
                                } catch (Throwable th4) {
/* 478 */                           th = th4;
/* 654 */                           httpURLConnection = httpURLConnection2;
/* 655 */                           responseCode = 0;
/* 645 */                           map = null;
/* 547 */                           th = th;
/* 680 */                           if (outputStream3 != null) {
                                    }
/* 701 */                           if (httpURLConnection != null) {
                                    }
/* 706 */                           l0o10OoO0 l0o10ooo03 = l0olllo1i2.I00io1l;
/* 708 */                           l0olllO1i.I000II(l0o10ooo03);
/* 726 */                           l0o10ooo03.I010o0o0oO(new l010iooill10(this.I00iio, l01llloo0, responseCode, null, null, map));
/* 729 */                           throw th;
                                }
                            }
/* 484 */                   if (bArr3 != null) {
/* 488 */                       lio010i lio010iVar = l0i1ioo.I00iiI.I00io1l;
/* 490 */                       lilOOl0.I00O0o1oo(lio010iVar);
/* 493 */                       byte[] bArrI01Iio10lo = lio010iVar.I01Iio10lo(bArr3);
/* 497 */                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i2.I00ilO0;
/* 499 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 502 */                       IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00lll10;
/* 504 */                       int length = bArrI01Iio10lo.length;
/* 509 */                       iOloiOI1.I0000Il00O("Uploading data. size", Integer.valueOf(length));
/* 513 */                       httpURLConnection2.setDoOutput(true);
/* 516 */                       httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
/* 519 */                       httpURLConnection2.setFixedLengthStreamingMode(length);
/* 522 */                       httpURLConnection2.connect();
/* 525 */                       OutputStream outputStream4 = httpURLConnection2.getOutputStream();
                                try {
/* 529 */                           outputStream4.write(bArrI01Iio10lo);
/* 532 */                           outputStream4.close();
                                } catch (IOException e3) {
/* 550 */                           iOException = e3;
/* 552 */                           responseCode = 0;
/* 554 */                           map2 = null;
/* 556 */                           outputStream3 = outputStream4;
/* 738 */                           if (outputStream3 != null) {
                                    }
/* 759 */                           if (httpURLConnection2 != null) {
                                    }
/* 764 */                           l0o10ooo0 = l0olllo1i2.I00io1l;
/* 766 */                           l0olllO1i.I000II(l0o10ooo0);
/* 777 */                           l010iooill10Var = new l010iooill10(this.I00iio, l01llloo0, responseCode, iOException, null, map2);
/* 621 */                           l0o10ooo0.I010o0o0oO(l010iooill10Var);
/* 782 */                           return;
                                } catch (Throwable th5) {
/* 536 */                           th = th5;
/* 540 */                           responseCode = 0;
/* 542 */                           map = null;
/* 544 */                           outputStream3 = outputStream4;
/* 546 */                           httpURLConnection = httpURLConnection2;
/* 547 */                           th = th;
/* 680 */                           if (outputStream3 != null) {
                                    }
/* 701 */                           if (httpURLConnection != null) {
                                    }
/* 706 */                           l0o10OoO0 l0o10ooo032 = l0olllo1i2.I00io1l;
/* 708 */                           l0olllO1i.I000II(l0o10ooo032);
/* 726 */                           l0o10ooo032.I010o0o0oO(new l010iooill10(this.I00iio, l01llloo0, responseCode, null, null, map));
/* 729 */                           throw th;
                                }
                            }
/* 560 */                   responseCode = httpURLConnection2.getResponseCode();
                            try {
                                try {
/* 564 */                           headerFields = httpURLConnection2.getHeaderFields();
                                    try {
/* 570 */                               byteArrayOutputStream = new ByteArrayOutputStream();
/* 573 */                               inputStream = httpURLConnection2.getInputStream();
                                    } catch (Throwable th6) {
/* 630 */                               th = th6;
/* 631 */                               inputStream = null;
                                    }
                                    try {
/* 579 */                               bArr = new byte[Barcode.FORMAT_UPC_E];
                                    } catch (Throwable th7) {
/* 591 */                               th = th7;
/* 633 */                               if (inputStream != null) {
/* 635 */                                   inputStream.close();
                                        }
/* 638 */                               throw th;
                                    }
                                } catch (IOException e4) {
/* 639 */                           iOException = e4;
/* 738 */                           if (outputStream3 != null) {
                                        try {
/* 740 */                                   outputStream3.close();
                                        } catch (IOException e5) {
/* 745 */                                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i2.I00ilO0;
/* 747 */                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 756 */                                   l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error closing HTTP compressed POST connection output stream. appId", e5);
                                        }
                                    }
/* 759 */                           if (httpURLConnection2 != null) {
/* 761 */                               httpURLConnection2.disconnect();
                                    }
/* 764 */                           l0o10ooo0 = l0olllo1i2.I00io1l;
/* 766 */                           l0olllO1i.I000II(l0o10ooo0);
/* 777 */                           l010iooill10Var = new l010iooill10(this.I00iio, l01llloo0, responseCode, iOException, null, map2);
/* 621 */                           l0o10ooo0.I010o0o0oO(l010iooill10Var);
/* 782 */                           return;
                                } catch (Throwable th8) {
/* 626 */                           th = th8;
/* 546 */                           httpURLConnection = httpURLConnection2;
/* 547 */                           th = th;
/* 680 */                           if (outputStream3 != null) {
                                        try {
/* 682 */                                   outputStream3.close();
                                        } catch (IOException e6) {
/* 687 */                                   l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i2.I00ilO0;
/* 689 */                                   l0olllO1i.I000II(l01o0io1ooo03);
/* 698 */                                   l01o0io1ooo03.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error closing HTTP compressed POST connection output stream. appId", e6);
                                        }
                                    }
/* 701 */                           if (httpURLConnection != null) {
/* 703 */                               httpURLConnection.disconnect();
                                    }
/* 706 */                           l0o10OoO0 l0o10ooo0322 = l0olllo1i2.I00io1l;
/* 708 */                           l0olllO1i.I000II(l0o10ooo0322);
/* 726 */                           l0o10ooo0322.I010o0o0oO(new l010iooill10(this.I00iio, l01llloo0, responseCode, null, null, map));
/* 729 */                           throw th;
                                }
                            } catch (IOException e7) {
/* 649 */                       iOException = e7;
/* 651 */                       map2 = null;
/* 738 */                       if (outputStream3 != null) {
                                }
/* 759 */                       if (httpURLConnection2 != null) {
                                }
/* 764 */                       l0o10ooo0 = l0olllo1i2.I00io1l;
/* 766 */                       l0olllO1i.I000II(l0o10ooo0);
/* 777 */                       l010iooill10Var = new l010iooill10(this.I00iio, l01llloo0, responseCode, iOException, null, map2);
/* 621 */                       l0o10ooo0.I010o0o0oO(l010iooill10Var);
/* 782 */                       return;
                            } catch (Throwable th9) {
/* 643 */                       th = th9;
/* 644 */                       httpURLConnection = httpURLConnection2;
/* 645 */                       map = null;
/* 547 */                       th = th;
/* 680 */                       if (outputStream3 != null) {
                                }
/* 701 */                       if (httpURLConnection != null) {
                                }
/* 706 */                       l0o10OoO0 l0o10ooo03222 = l0olllo1i2.I00io1l;
/* 708 */                       l0olllO1i.I000II(l0o10ooo03222);
/* 726 */                       l0o10ooo03222.I010o0o0oO(new l010iooill10(this.I00iio, l01llloo0, responseCode, null, null, map));
/* 729 */                       throw th;
                            }
                            while (true) {
/* 581 */                       int i4 = inputStream.read(bArr);
/* 585 */                       if (i4 <= 0) {
/* 593 */                           byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 597 */                           inputStream.close();
/* 600 */                           httpURLConnection2.disconnect();
/* 603 */                           l0o10ooo0 = l0olllo1i2.I00io1l;
/* 605 */                           l0olllO1i.I000II(l0o10ooo0);
/* 616 */                           l010iooill10Var = new l010iooill10(this.I00iio, l01llloo0, responseCode, null, byteArray, headerFields);
/* 621 */                           l0o10ooo0.I010o0o0oO(l010iooill10Var);
/* 782 */                           return;
                                }
/* 587 */                       byteArrayOutputStream.write(bArr, 0, i4);
                            }
                        default:
/* 36 */                    lIloiI liloii = (lIloiI) i01O1lIi;
/* 40 */                    l0olllO1i l0olllo1i3 = (l0olllO1i) liloii.I00iOIl;
/* 44 */                    l0olllO1i l0olllo1i4 = (l0olllO1i) liloii.I00iOIl;
/* 46 */                    l0o10OoO0 l0o10ooo04 = l0olllo1i3.I00io1l;
/* 48 */                    l0olllO1i.I000II(l0o10ooo04);
/* 51 */                    l0o10ooo04.I010ioo();
                            try {
/* 54 */                        uRLConnectionOpenConnection2 = url.openConnection();
                            } catch (IOException e8) {
/* 349 */                       iOException2 = e8;
/* 350 */                       outputStream2 = null;
/* 351 */                       httpURLConnection4 = null;
                            } catch (Throwable th10) {
/* 314 */                       th2 = th10;
/* 315 */                       outputStream = null;
/* 316 */                       httpURLConnection3 = null;
/* 317 */                       map3 = null;
                            }
/* 60 */                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
/* 313 */                       throw new IOException("Failed to obtain HTTP connection");
                            }
/* 63 */                    HttpURLConnection httpURLConnection5 = (HttpURLConnection) uRLConnectionOpenConnection2;
/* 65 */                    httpURLConnection5.setDefaultUseCaches(false);
/* 68 */                    iIl1iil iil1iil2 = l0olllo1i4.I00iio;
/* 70 */                    httpURLConnection5.setConnectTimeout(60000);
/* 73 */                    httpURLConnection5.setReadTimeout(61000);
/* 76 */                    httpURLConnection5.setInstanceFollowRedirects(false);
/* 79 */                    httpURLConnection5.setDoInput(true);
/* 82 */                    if (map7 != null) {
                                try {
                                    try {
/* 96 */                                for (Map.Entry entry2 : map7.entrySet()) {
/* 116 */                                   httpURLConnection5.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                        }
/* 126 */                               if (bArr3 != null) {
                                            try {
/* 130 */                                       ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
/* 135 */                                       GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream3);
/* 138 */                                       gZIPOutputStream.write(bArr3);
/* 141 */                                       gZIPOutputStream.close();
/* 144 */                                       byteArrayOutputStream3.close();
/* 147 */                                       byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
/* 151 */                                       l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i4.I00ilO0;
/* 153 */                                       l0olllO1i.I000II(l01o0io1ooo04);
/* 156 */                                       IOloiOI1 iOloiOI12 = l01o0io1ooo04.I00lll10;
/* 158 */                                       int length2 = byteArray2.length;
/* 163 */                                       iOloiOI12.I0000Il00O("Uploading data. size", Integer.valueOf(length2));
/* 166 */                                       httpURLConnection5.setDoOutput(true);
/* 169 */                                       httpURLConnection5.addRequestProperty("Content-Encoding", "gzip");
/* 172 */                                       httpURLConnection5.setFixedLengthStreamingMode(length2);
/* 175 */                                       httpURLConnection5.connect();
/* 178 */                                       outputStream = httpURLConnection5.getOutputStream();
                                                try {
/* 182 */                                           outputStream.write(byteArray2);
/* 185 */                                           outputStream.close();
                                                } catch (IOException e9) {
/* 199 */                                           iOException2 = e9;
/* 200 */                                           outputStream2 = outputStream;
/* 201 */                                           httpURLConnection4 = httpURLConnection5;
/* 202 */                                           map4 = null;
/* 354 */                                           if (outputStream2 != null) {
                                                    }
/* 375 */                                           if (httpURLConnection4 != null) {
                                                    }
/* 381 */                                           I00000oIO(i3, iOException2, null, map4);
/* 384 */                                           return;
                                                } catch (Throwable th11) {
/* 189 */                                           th = th11;
/* 193 */                                           httpURLConnection3 = httpURLConnection5;
/* 194 */                                           r6 = 0;
/* 195 */                                           th2 = th;
                                                    map3 = r6;
/* 318 */                                           if (outputStream != null) {
                                                    }
/* 339 */                                           if (httpURLConnection3 != null) {
                                                    }
/* 345 */                                           I00000oIO(i3, null, null, map3);
/* 348 */                                           throw th2;
                                                }
                                            } catch (IOException e10) {
/* 206 */                                       l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i4.I00ilO0;
/* 208 */                                       l0olllO1i.I000II(l01o0io1ooo05);
/* 215 */                                       l01o0io1ooo05.I00ilO0.I0000Il00O("Failed to gzip post request content", e10);
/* 218 */                                       throw e10;
                                            }
                                        }
/* 219 */                               responseCode2 = httpURLConnection5.getResponseCode();
                                    } catch (IOException e11) {
/* 123 */                               e = e11;
/* 301 */                               httpURLConnection4 = httpURLConnection5;
/* 302 */                               map5 = null;
/* 287 */                               iOException2 = e;
/* 288 */                               outputStream2 = null;
                                        map4 = map5;
/* 354 */                               if (outputStream2 != null) {
                                            try {
/* 356 */                                       outputStream2.close();
                                            } catch (IOException e12) {
/* 361 */                                       l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i4.I00ilO0;
/* 363 */                                       l0olllO1i.I000II(l01o0io1ooo06);
/* 372 */                                       l01o0io1ooo06.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error closing HTTP compressed POST connection output stream. appId", e12);
                                            }
                                        }
/* 375 */                               if (httpURLConnection4 != null) {
/* 377 */                                   httpURLConnection4.disconnect();
                                        }
/* 381 */                               I00000oIO(i3, iOException2, null, map4);
/* 384 */                               return;
                                    }
                                } catch (Throwable th12) {
/* 120 */                           th = th12;
/* 299 */                           httpURLConnection3 = httpURLConnection5;
/* 293 */                           outputStream = null;
/* 194 */                           r6 = 0;
/* 195 */                           th2 = th;
                                    map3 = r6;
/* 318 */                           if (outputStream != null) {
                                    }
/* 339 */                           if (httpURLConnection3 != null) {
                                    }
/* 345 */                           I00000oIO(i3, null, null, map3);
/* 348 */                           throw th2;
                                }
                                try {
                                    try {
/* 223 */                               Map<String, List<String>> headerFields2 = httpURLConnection5.getHeaderFields();
                                        try {
/* 229 */                                   byteArrayOutputStream2 = new ByteArrayOutputStream();
/* 232 */                                   inputStream2 = httpURLConnection5.getInputStream();
                                            try {
/* 238 */                                       bArr2 = new byte[Barcode.FORMAT_UPC_E];
                                                while (true) {
/* 240 */                                           i = inputStream2.read(bArr2);
/* 244 */                                           if (i > 0) {
/* 252 */                                               byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
/* 256 */                                               inputStream2.close();
/* 259 */                                               httpURLConnection5.disconnect();
/* 263 */                                               I00000oIO(responseCode2, null, byteArray3, headerFields2);
/* 384 */                                               return;
                                                    }
/* 246 */                                           byteArrayOutputStream2.write(bArr2, 0, i);
                                                }
                                            } catch (Throwable th13) {
/* 250 */                                       th = th13;
/* 274 */                                       if (inputStream2 != null) {
/* 276 */                                           inputStream2.close();
                                                }
/* 279 */                                       throw th;
                                            }
                                        } catch (Throwable th14) {
/* 272 */                                   th = th14;
/* 273 */                                   inputStream2 = null;
                                        }
                                    } catch (IOException e13) {
/* 295 */                               e = e13;
/* 296 */                               i3 = responseCode2;
/* 297 */                               map6 = null;
/* 286 */                               httpURLConnection4 = httpURLConnection5;
                                        map5 = map6;
/* 287 */                               iOException2 = e;
/* 288 */                               outputStream2 = null;
                                        map4 = map5;
/* 354 */                               if (outputStream2 != null) {
                                        }
/* 375 */                               if (httpURLConnection4 != null) {
                                        }
/* 381 */                               I00000oIO(i3, iOException2, null, map4);
/* 384 */                               return;
                                    } catch (Throwable th15) {
/* 290 */                               th = th15;
/* 291 */                               httpURLConnection3 = httpURLConnection5;
/* 292 */                               i3 = responseCode2;
/* 293 */                               outputStream = null;
/* 194 */                               r6 = 0;
/* 195 */                               th2 = th;
                                        map3 = r6;
/* 318 */                               if (outputStream != null) {
                                        }
/* 339 */                               if (httpURLConnection3 != null) {
                                        }
/* 345 */                               I00000oIO(i3, null, null, map3);
/* 348 */                               throw th2;
                                    }
                                } catch (IOException e14) {
/* 270 */                           e = e14;
/* 285 */                           i3 = responseCode2;
                                    map6 = r5;
/* 286 */                           httpURLConnection4 = httpURLConnection5;
                                    map5 = map6;
/* 287 */                           iOException2 = e;
/* 288 */                           outputStream2 = null;
                                    map4 = map5;
/* 354 */                           if (outputStream2 != null) {
                                    }
/* 375 */                           if (httpURLConnection4 != null) {
                                    }
/* 381 */                           I00000oIO(i3, iOException2, null, map4);
/* 384 */                           return;
                                } catch (Throwable th16) {
/* 268 */                           th = th16;
/* 280 */                           i3 = responseCode2;
/* 9 */                             r6 = "Content-Encoding";
/* 282 */                           outputStream = null;
/* 283 */                           httpURLConnection3 = httpURLConnection5;
/* 195 */                           th2 = th;
                                    map3 = r6;
/* 318 */                           if (outputStream != null) {
                                    }
/* 339 */                           if (httpURLConnection3 != null) {
                                    }
/* 345 */                           I00000oIO(i3, null, null, map3);
/* 348 */                           throw th2;
                                }
                            } else {
/* 126 */                       if (bArr3 != null) {
                                }
/* 219 */                       responseCode2 = httpURLConnection5.getResponseCode();
/* 223 */                       Map<String, List<String>> headerFields22 = httpURLConnection5.getHeaderFields();
/* 229 */                       byteArrayOutputStream2 = new ByteArrayOutputStream();
/* 232 */                       inputStream2 = httpURLConnection5.getInputStream();
/* 238 */                       bArr2 = new byte[Barcode.FORMAT_UPC_E];
                                while (true) {
/* 240 */                           i = inputStream2.read(bArr2);
/* 244 */                           if (i > 0) {
                                    }
/* 246 */                           byteArrayOutputStream2.write(bArr2, 0, i);
                                }
                            }
/* 318 */                   if (outputStream != null) {
                                try {
/* 320 */                           outputStream.close();
                                } catch (IOException e15) {
/* 325 */                           l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i4.I00ilO0;
/* 327 */                           l0olllO1i.I000II(l01o0io1ooo07);
/* 336 */                           l01o0io1ooo07.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error closing HTTP compressed POST connection output stream. appId", e15);
                                }
                            }
/* 339 */                   if (httpURLConnection3 != null) {
/* 341 */                       httpURLConnection3.disconnect();
                            }
/* 345 */                   I00000oIO(i3, null, null, map3);
/* 348 */                   throw th2;
                    }
                }

/* 28 */        public l0I0Ii1OIi0(lIloiI liloii, String str, URL url, byte[] bArr, HashMap map, lIlOiO0OoO0 liloio0ooo0) {
                    Objects.requireNonNull(liloii);
                    this.I00io1l = liloii;
/* 30 */            lII0I0I000I.I0000O(str);
/* 31 */            this.I00iiI = url;
                    this.I00iiO = bArr;
                    this.I00ilO0 = liloio0ooo0;
                    this.I00iio = str;
                    this.I00ilI0I1 = map;
                }
            }
