            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litertlm.Backend;
            import com.google.ai.edge.litertlm.BenchmarkInfo;
            import com.google.ai.edge.litertlm.BenchmarkKt;
            import com.google.ai.edge.litertlm.ExperimentalFlags;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Locale;
            
            public final class II0IOII0i0I extends Oll0io implements IlliIl1l11O {
                public final II0IOO1i I00iOIl;
                public final int I00iiI;
                public final O1oIOiI11o0 I00iiO;
                public final String I00iio;
                public final int I00ilI0I1;
                public final int I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II0IOII0i0I(II0IOO1i iI0IOO1i, int i, O1oIOiI11o0 o1oIOiI11o0, String str, int i2, int i3, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = iI0IOO1i;
/* 3 */             this.I00iiI = i;
/* 5 */             this.I00iiO = o1oIOiI11o0;
/* 7 */             this.I00iio = str;
/* 9 */             this.I00ilI0I1 = i2;
/* 11 */            this.I00ilO0 = i3;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            return new II0IOII0i0I(this.I00iOIl, this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 9 */             II0IOII0i0I iI0IOII0i0I = (II0IOII0i0I) create((Ii0110) obj, (IOoil1iiIilo) obj2);
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            iI0IOII0i0I.invokeSuspend(ooiIlOl1iI);
/* 37 */            return ooiIlOl1iI;
                }

                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:53:0x01ca A[Catch: all -> 0x0355, TryCatch #2 {all -> 0x0355, blocks: (B:51:0x01c4, B:53:0x01ca, B:55:0x01d3), top: B:78:0x01c4 }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x01d1  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0201  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0209  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object value;
                    boolean z;
                    Backend gpu;
                    ArrayList arrayList;
                    double d;
                    String str;
                    String strI00OIl;
                    BenchmarkInfo benchmarkInfoBenchmark;
                    String str2;
/* 3 */             O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 5 */             String str3 = o1oIOiI11o0.I00000oIO;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             lIoii1l01l0i.I00000oOI(obj);
/* 12 */            II0IOO1i iI0IOO1i = this.I00iOIl;
/* 14 */            Context context = iI0IOO1i.I00000oOI;
/* 17 */            iI0IOO1i.I000l1(true);
/* 22 */            iI0IOO1i.I000OOo1O("");
/* 26 */            iI0IOO1i.I000iOII(0);
/* 29 */            OlO0OIIl1 olO0OIIl1 = iI0IOO1i.I0000O;
/* 65 */            do {
/* 31 */                value = olO0OIIl1.getValue();
/* 65 */            } while (!olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), null, null, false, false, this.I00iiI, 0, null, 111)));
/* 67 */            iI0IOO1i.I000lI(true);
/* 86 */            String str4 = this.I00iio;
/* 88 */            String strConcat = "- accelerator: ".concat(str4);
/* 94 */            int i = this.I00ilI0I1;
/* 96 */            String strI000oI1ioi = Oi010OO0.I000oI1ioi(i, "- prefill tokens: ");
/* 102 */           int i2 = this.I00ilO0;
/* 104 */           String strI000oI1ioi2 = Oi010OO0.I000oI1ioi(i2, "- decode tokens: ");
/* 110 */           int i3 = this.I00iiI;
/* 137 */           IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0("- model: " + str3, strConcat, strI000oI1ioi, strI000oI1ioi2, Oi010OO0.I000oI1ioi(i3, "- runs: ")), "\n", null, null, null, 62);
/* 140 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 146 */           ArrayList arrayList2 = new ArrayList();
/* 151 */           ArrayList arrayList3 = new ArrayList();
/* 156 */           ArrayList arrayList4 = new ArrayList();
/* 161 */           ArrayList arrayList5 = new ArrayList();
/* 164 */           OlO0OIIl1 olO0OIIl12 = olO0OIIl1;
/* 186 */           File file = new File(context.getCacheDir(), IlIi0I0.I000iOII(System.currentTimeMillis(), "benchmark_"));
/* 189 */           String absolutePath = file.getAbsolutePath();
/* 199 */           if (file.mkdirs()) {
/* 232 */               z = true;
                    } else {
/* 219 */               Log.e("AGBenchmarkVM", "Failed to create benchmark cache directory: " + file.getAbsolutePath());
/* 226 */               absolutePath = context.getCacheDir().getAbsolutePath();
/* 230 */               z = false;
                    }
/* 235 */           String lowerCase = str4.toLowerCase(Locale.ROOT);
/* 239 */           boolean z2 = z;
/* 241 */           int iHashCode = lowerCase.hashCode();
/* 253 */           if (iHashCode == 102572) {
/* 313 */               gpu = lowerCase.equals("gpu") ? new Backend.GPU() : new Backend.CPU(null, 1, null);
                    } else if (iHashCode != 109299) {
/* 286 */               O111ooi11li o111ooi11li = O111ooi11li.I00000oIO;
/* 292 */               gpu = new Backend.NPU(O111ooi11li.I000iOII(context));
                    } else {
/* 286 */               O111ooi11li o111ooi11li2 = O111ooi11li.I00000oIO;
/* 292 */               gpu = new Backend.NPU(O111ooi11li.I000iOII(context));
                    }
/* 318 */           String strI00000oOI = o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO);
                    try {
/* 326 */               ExperimentalFlags.INSTANCE.setEnableSpeculativeDecoding(Boolean.FALSE);
/* 329 */               int i4 = 0;
/* 330 */               d = 0.0d;
/* 332 */               while (i4 < i3) {
                            try {
/* 334 */                       System.nanoTime();
/* 337 */                       benchmarkInfoBenchmark = BenchmarkKt.benchmark(strI00000oOI, gpu, i, i2, absolutePath);
/* 341 */                       System.nanoTime();
/* 353 */                       ArrayList arrayList6 = arrayList2;
/* 355 */                       double initTimeInSecond = benchmarkInfoBenchmark.getInitTimeInSecond() * 1000.0d;
/* 357 */                       if (i4 == 0) {
/* 359 */                           str2 = absolutePath;
/* 361 */                           d = initTimeInSecond;
                                } else {
/* 363 */                           str2 = absolutePath;
                                    try {
/* 370 */                               arrayList5.add(new Double(initTimeInSecond));
                                    } catch (Throwable th) {
/* 429 */                               th = th;
/* 430 */                               arrayList = arrayList6;
                                        try {
/* 453 */                                   String message = th.getMessage();
/* 466 */                                   if (message == null) {
                                            }
/* 470 */                                   StringBuilder sb = new StringBuilder();
/* 475 */                                   sb.append("Benchmark failed for ");
/* 478 */                                   str = str3;
/* 480 */                                   sb.append(str);
/* 487 */                                   Log.e("AGBenchmarkVM", sb.toString(), th);
/* 494 */                                   ExperimentalFlags.INSTANCE.setEnableSpeculativeDecoding(Boolean.FALSE);
/* 498 */                                   long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 502 */                                   if (z2) {
                                            }
/* 510 */                                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 512 */                                   if (strI00OIl != null) {
                                            }
                                        } catch (Throwable th2) {
/* 859 */                                   ExperimentalFlags.INSTANCE.setEnableSpeculativeDecoding(Boolean.FALSE);
/* 862 */                                   throw th2;
                                        }
                                    }
                                }
/* 382 */                       arrayList = arrayList6;
                            } catch (Throwable th3) {
/* 433 */                       th = th3;
/* 434 */                       arrayList = arrayList2;
                            }
                            try {
/* 384 */                       arrayList.add(new Double(benchmarkInfoBenchmark.getLastPrefillTokensPerSecond()));
/* 387 */                       String str5 = strI00000oOI;
/* 392 */                       Backend backend = gpu;
/* 399 */                       arrayList3.add(new Double(benchmarkInfoBenchmark.getLastDecodeTokensPerSecond()));
/* 411 */                       arrayList4.add(new Double(benchmarkInfoBenchmark.getTimeToFirstTokenInSecond()));
/* 414 */                       i4++;
/* 416 */                       iI0IOO1i.I000iOII(i4);
/* 419 */                       strI00000oOI = str5;
/* 420 */                       absolutePath = str2;
/* 422 */                       gpu = backend;
/* 424 */                       arrayList2 = arrayList;
                            } catch (Throwable th4) {
/* 427 */                       th = th4;
/* 453 */                       String message2 = th.getMessage();
/* 466 */                       strI00OIl = message2 == null ? OlOoOIi0o.I00OIl(200, message2) : "Benchmark failed";
/* 470 */                       StringBuilder sb2 = new StringBuilder();
/* 475 */                       sb2.append("Benchmark failed for ");
/* 478 */                       str = str3;
/* 480 */                       sb2.append(str);
/* 487 */                       Log.e("AGBenchmarkVM", sb2.toString(), th);
/* 494 */                       ExperimentalFlags.INSTANCE.setEnableSpeculativeDecoding(Boolean.FALSE);
/* 498 */                       long jCurrentTimeMillis22 = System.currentTimeMillis();
/* 502 */                       if (z2) {
                                }
/* 510 */                       OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 512 */                       if (strI00OIl != null) {
                                }
                            }
                        }
/* 436 */               arrayList = arrayList2;
/* 441 */               ExperimentalFlags.INSTANCE.setEnableSpeculativeDecoding(Boolean.FALSE);
/* 444 */               str = str3;
/* 446 */               strI00OIl = null;
                    } catch (Throwable th5) {
/* 449 */               th = th5;
/* 450 */               arrayList = arrayList2;
/* 451 */               d = 0.0d;
                    }
/* 498 */           long jCurrentTimeMillis222 = System.currentTimeMillis();
/* 502 */           if (z2) {
/* 504 */               IlIl10.I0000O(file);
/* 507 */               file.getAbsolutePath();
                    }
/* 510 */           OoiIlOl1iI ooiIlOl1iI22 = OoiIlOl1iI.I00000oIO;
/* 512 */           if (strI00OIl != null) {
/* 514 */               iI0IOO1i.I000OOo1O(strI00OIl);
/* 518 */               iI0IOO1i.I000l1(false);
/* 521 */               return ooiIlOl1iI22;
                    }
/* 522 */           O111O0IIi o111O0IIiI001lIiIIo1O = O111OO1Oi.I001lIiIIo1O();
/* 526 */           o111O0IIiI001lIiIIo1O.I0000O();
/* 539 */           ((O111OO1Oi) o111O0IIiI001lIiIIo1O.I00iiI).I00IioO0OiOi(jCurrentTimeMillis);
/* 542 */           o111O0IIiI001lIiIIo1O.I0000O();
/* 549 */           ((O111OO1Oi) o111O0IIiI001lIiIIo1O.I00iiI).I00II0oii1o(jCurrentTimeMillis222);
/* 552 */           o111O0IIiI001lIiIIo1O.I0000O();
/* 559 */           ((O111OO1Oi) o111O0IIiI001lIiIIo1O.I00iiI).I00IO1(str);
/* 562 */           o111O0IIiI001lIiIIo1O.I0000O();
/* 571 */           ((O111OO1Oi) o111O0IIiI001lIiIIo1O.I00iiI).I001lllioOl(str4);
/* 574 */           o111O0IIiI001lIiIIo1O.I0000O();
/* 581 */           ((O111OO1Oi) o111O0IIiI001lIiIIo1O.I00iiI).I00IOO(i);
/* 584 */           o111O0IIiI001lIiIIo1O.I0000O();
/* 591 */           ((O111OO1Oi) o111O0IIiI001lIiIIo1O.I00iiI).I00II0Ol1O0l(i2);
/* 594 */           o111O0IIiI001lIiIIo1O.I0000O();
/* 601 */           ((O111OO1Oi) o111O0IIiI001lIiIIo1O.I00iiI).I00IO1oi11O(i3);
/* 604 */           o111O0IIiI001lIiIIo1O.I0000O();
/* 611 */           ((O111OO1Oi) o111O0IIiI001lIiIIo1O.I00iiI).I001lloI();
/* 618 */           O111OO1Oi o111OO1Oi = (O111OO1Oi) o111O0IIiI001lIiIIo1O.I00000oOI();
/* 620 */           O111iiO11l o111iiO11lI001i1lo1io = O111oIiol1.I001i1lo1io();
/* 624 */           Ooo010llO ooo010llOI0000oI00 = II0IOO1i.I0000oI00(arrayList);
/* 628 */           o111iiO11lI001i1lo1io.I0000O();
/* 635 */           ((O111oIiol1) o111iiO11lI001i1lo1io.I00iiI).I001lllioOl(ooo010llOI0000oI00);
/* 638 */           Ooo010llO ooo010llOI0000oI002 = II0IOO1i.I0000oI00(arrayList3);
/* 642 */           o111iiO11lI001i1lo1io.I0000O();
/* 649 */           ((O111oIiol1) o111iiO11lI001i1lo1io.I00iiI).I001iOo1i0O(ooo010llOI0000oI002);
/* 652 */           Ooo010llO ooo010llOI0000oI003 = II0IOO1i.I0000oI00(arrayList4);
/* 656 */           o111iiO11lI001i1lo1io.I0000O();
/* 663 */           ((O111oIiol1) o111iiO11lI001i1lo1io.I00iiI).I001lloI(ooo010llOI0000oI003);
/* 666 */           o111iiO11lI001i1lo1io.I0000O();
/* 673 */           ((O111oIiol1) o111iiO11lI001i1lo1io.I00iiI).I001l0I00(d);
/* 676 */           Ooo010llO ooo010llOI0000oI004 = II0IOO1i.I0000oI00(arrayList5);
/* 680 */           o111iiO11lI001i1lo1io.I0000O();
/* 687 */           ((O111oIiol1) o111iiO11lI001i1lo1io.I00iiI).I001lIiIIo1O(ooo010llOI0000oI004);
/* 694 */           O111oIiol1 o111oIiol1 = (O111oIiol1) o111iiO11lI001i1lo1io.I00000oOI();
/* 696 */           II00OIO ii00oioI0010o = II00OOlli.I0010o();
/* 700 */           O111OOIIIi o111OOIIIiI001IIilI0O = O111Oli.I001IIilI0O();
/* 704 */           o111OOIIIiI001IIilI0O.I0000O();
/* 711 */           ((O111Oli) o111OOIIIiI001IIilI0O.I00iiI).I001IO000(o111OO1Oi);
/* 714 */           o111OOIIIiI001IIilI0O.I0000O();
/* 721 */           ((O111Oli) o111OOIIIiI001IIilI0O.I00iiI).I001i1O0Ol(o111oIiol1);
/* 728 */           O111Oli o111Oli = (O111Oli) o111OOIIIiI001IIilI0O.I00000oOI();
/* 730 */           ii00oioI0010o.I0000O();
/* 737 */           ((II00OOlli) ii00oioI0010o.I00iiI).I00111O(o111Oli);
/* 744 */           II00OOlli iI00OOlli = (II00OOlli) ii00oioI0010o.I00000oOI();
/* 758 */           ArrayList arrayList7 = new ArrayList(((II0I0ili0) olO0OIIl12.getValue()).I00000oIO);
/* 761 */           I01Io1ilOIIo i01Io1ilOIIo = OOl1i000OO.I00iOIl;
/* 773 */           String strValueOf = String.valueOf(OOl1i000OO.I00iOIl.I0000O().nextDouble());
/* 786 */           arrayList7.add(0, new II00Ol1Ii(strValueOf, iI00OOlli, true, 36));
                    while (true) {
/* 789 */               Object value2 = olO0OIIl12.getValue();
/* 814 */               OlO0OIIl1 olO0OIIl13 = olO0OIIl12;
/* 820 */               if (olO0OIIl13.I000iOII(value2, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl12.getValue(), arrayList7, null, false, false, 0, 0, null, 126))) {
/* 824 */                   Ii1liIllli0 ii1liIllli0 = iI0IOO1i.I0000Il00O;
/* 826 */                   ii1liIllli0.getClass();
/* 836 */                   iOi1IOoIO0l.I00000oOI(new Ii1O001loIoO(ii1liIllli0, iI00OOlli, null, 4));
/* 839 */                   iI0IOO1i.I000O01llI0();
/* 843 */                   iI0IOO1i.I000OiO(strValueOf, true);
/* 847 */                   iI0IOO1i.I000l1(false);
/* 850 */                   return ooiIlOl1iI22;
                        }
/* 851 */               olO0OIIl12 = olO0OIIl13;
                    }
                }
            }
