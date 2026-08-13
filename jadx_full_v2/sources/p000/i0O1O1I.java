            package p000;

            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Properties;
            
            public final class i0O1O1I {
                public static final OlOilIlol1 I0000O = new OlOilIlol1("ExtractorTaskFinder");
                public i0O1I1o I00000oIO;
                public i0Il00O1 I00000oOI;
                public i0Iol0l1lIl I0000Il00O;

                /* JADX WARN: Code restructure failed: missing block: B:105:0x02ca, code lost:
                
                    r9.I00000oIO("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", java.lang.Integer.valueOf(r11), java.lang.Integer.valueOf(r7.I00000oIO), (java.lang.String) r7.I0000Il00O.I0000O, r14, java.lang.Integer.valueOf(r0));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:107:0x02dd, code lost:
                
                    r3 = r2.I00000oIO(r7.I00000oIO, r0, (java.lang.String) r7.I0000Il00O.I0000O, r14);
                    r5 = r7.I00000oIO;
                    r6 = r7.I0000Il00O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x02e7, code lost:
                
                    r8 = (java.lang.String) r6.I0000O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:109:0x02eb, code lost:
                
                    r10 = r7.I00000oOI;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:110:0x02ed, code lost:
                
                    r21 = r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:111:0x02f0, code lost:
                
                    r12 = r6.I00000oIO;
                    r6 = (java.lang.String) r6.I0000oI00;
                    r15 = r12.size();
                    r7 = r7.I0000Il00O;
                    r22 = r2;
                    r1 = r7.I00000oOI;
                    r7 = r7.I0000Il00O;
                    r4 = new p000.i0O01I(r5, r8);
                    r4.I0000Il00O = r10;
                    r4.I0000O = r12;
                    r4.I0000oI00 = r6;
                    r4.I0001Ioi1lo = r14;
                    r4.I000II = r11;
                    r4.I000O01llI0 = r0;
                    r4.I000OOo1O = r15;
                    r4.I000OiO = r1;
                    r4.I000iOII = r7;
                    r4.I000l1 = r3;
                    java.lang.invoke.VarHandle.storeStoreFence();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:113:0x0321, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:145:0x0397, code lost:
                
                    r9.I00000oIO("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r1.I00000oIO), (java.lang.String) r1.I0000Il00O.I0000O, r7);
                    r0 = r22.I00000oIO(r1.I00000oIO, 0, (java.lang.String) r1.I0000Il00O.I0000O, r7);
                    r5 = r1.I00000oIO;
                    r6 = (java.lang.String) r1.I0000Il00O.I0000O;
                    r8 = (int) p000.i0Il00O1.I00000oOI(new java.io.File(r16.I0000O(), r6), true);
                    r9 = (java.lang.String) r1.I0000Il00O.I0000O;
                    r9 = p000.i0Il00O1.I00000oOI(new java.io.File(new java.io.File(r16.I0000O(), r9), java.lang.String.valueOf((int) p000.i0Il00O1.I00000oOI(new java.io.File(r16.I0000O(), r9), true))), true);
                    r11 = r1.I00000oOI;
                    r12 = r1.I0000Il00O.I00000oIO;
                    r14 = r3.I0000Il00O;
                    r2 = new p000.i0OI1oo1(r5, r6);
                    r2.I0000Il00O = r8;
                    r2.I0000O = r9;
                    r2.I0000oI00 = r11;
                    r2.I0001Ioi1lo = r12;
                    r2.I000II = r4;
                    r2.I000O01llI0 = r7;
                    r2.I000OOo1O = r14;
                    r2.I000OiO = r0;
                    java.lang.invoke.VarHandle.storeStoreFence();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0209, code lost:
                
                    r9.I00000oIO("Found verify task for session %s with pack %s and slice %s.", java.lang.Integer.valueOf(r8), r10, r14);
                    r6 = r6.I00000oOI;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x021a, code lost:
                
                    r16 = r3;
                    r13 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x021d, code lost:
                
                    r3 = r7.I00000oIO;
                    r7 = r12.I00000oOI;
                    r0 = new p000.i0OIl0l0000O(r8, r10);
                    r0.I0000Il00O = r6;
                    r0.I0000O = r3;
                    r0.I0000oI00 = r14;
                    r0.I0001Ioi1lo = r7;
                    java.lang.invoke.VarHandle.storeStoreFence();
                    r0 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x0230, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:157:0x0442 A[PHI: r0
                  0x0442: PHI (r0v10 i0O01I) = (r0v9 i0O01I), (r0v14 i0O01I), (r0v17 i0O01I) binds: [B:25:0x00a6, B:38:0x012d, B:51:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IOOOI0 I00000oIO() {
                    i0O1I1o i0o1i1o;
                    OlOilIlol1 olOilIlol1;
                    i0O01I i0o01i;
                    i0O01I i0o01i2;
                    OlOilIlol1 olOilIlol12;
                    ArrayList arrayList;
                    i0O1I1o i0o1i1o2;
                    i0O01I i0o01i3;
                    i0OI1oo1 i0oi1oo1;
                    int iI00000oIO;
/* 1 */             i0O1O1I i0o1o1i = this;
/* 3 */             i0Iol0l1lIl i0iol0l1lil = i0o1o1i.I0000Il00O;
/* 5 */             i0Il00O1 i0il00o1 = i0o1o1i.I00000oOI;
/* 7 */             i0O1I1o i0o1i1o3 = i0o1o1i.I00000oIO;
                    try {
/* 11 */                i0o1i1o3.I0000O.lock();
/* 16 */                ArrayList arrayList2 = new ArrayList();
/* 33 */                for (i0O10o1 i0o10o1 : i0o1i1o3.I0000Il00O.values()) {
/* 49 */                    if (liIoOlIoI1II.I00000oIO(i0o10o1.I0000Il00O.I0000Il00O)) {
/* 51 */                        arrayList2.add(i0o10o1);
                            }
                        }
/* 63 */                if (!arrayList2.isEmpty()) {
/* 69 */                    HashMap mapI000oI1ioi = i0il00o1.I000oI1ioi();
/* 73 */                    Iterator it = arrayList2.iterator();
                            while (true) {
/* 77 */                        boolean zHasNext = it.hasNext();
/* 82 */                        olOilIlol1 = I0000O;
/* 84 */                        if (!zHasNext) {
/* 166 */                           i0o01i = null;
                                    break;
                                }
/* 90 */                        i0O10o1 i0o10o12 = (i0O10o1) it.next();
/* 92 */                        i0O1001OIi i0o1001oii = i0o10o12.I0000Il00O;
/* 94 */                        int i = i0o10o12.I00000oIO;
/* 98 */                        String str = (String) i0o1001oii.I0000O;
/* 100 */                       long j = i0o1001oii.I00000oIO;
/* 110 */                       Long l = (Long) mapI000oI1ioi.get((String) i0o1001oii.I0000O);
/* 112 */                       if (l != null && j == l.longValue()) {
/* 132 */                           olOilIlol1.I00000oIO("Found promote pack task for session %s with pack %s.", Integer.valueOf(i), str);
/* 150 */                           int iI00000oOI = (int) i0Il00O1.I00000oOI(new File(i0il00o1.I0000O(), str), true);
/* 151 */                           int i2 = i0o10o12.I00000oOI;
/* 153 */                           i0OIIl i0oiil = new i0OIIl(i, str);
/* 156 */                           i0oiil.I0000Il00O = iI00000oOI;
/* 158 */                           i0oiil.I0000O = i2;
/* 160 */                           i0oiil.I0000oI00 = j;
/* 162 */                           VarHandle.storeStoreFence();
                                    i0o01i = i0oiil;
                                    break;
                                }
                            }
/* 167 */                   if (i0o01i == null) {
/* 169 */                       Iterator it2 = arrayList2.iterator();
                                while (true) {
/* 177 */                           if (!it2.hasNext()) {
/* 300 */                               olOilIlol12 = olOilIlol1;
/* 301 */                               i0o01i = null;
                                        break;
                                    }
/* 183 */                           i0O10o1 i0o10o13 = (i0O10o1) it2.next();
                                    try {
/* 185 */                               i0O1001OIi i0o1001oii2 = i0o10o13.I0000Il00O;
/* 187 */                               int i3 = i0o10o13.I00000oIO;
/* 189 */                               int i4 = i0o10o13.I00000oOI;
/* 193 */                               String str2 = (String) i0o1001oii2.I0000O;
/* 199 */                               OlOilIlol1 olOilIlol13 = olOilIlol1;
/* 215 */                               if (i0il00o1.I000OOo1O(i4, i0o1001oii2.I00000oIO, (String) i0o1001oii2.I0000O) == ((ArrayList) i0o1001oii2.I0001Ioi1lo).size()) {
/* 227 */                                   olOilIlol12 = olOilIlol13;
/* 229 */                                   olOilIlol12.I00000oIO("Found final move task for session %s with pack %s.", Integer.valueOf(i3), str2);
/* 235 */                                   long j2 = i0o1001oii2.I00000oIO;
/* 239 */                                   String str3 = (String) i0o1001oii2.I0000oI00;
/* 241 */                                   i0O1o10oo i0o1o10oo = new i0O1o10oo(i3, str2);
/* 244 */                                   i0o1o10oo.I0000Il00O = i4;
/* 246 */                                   i0o1o10oo.I0000O = j2;
/* 248 */                                   i0o1o10oo.I0000oI00 = str3;
/* 250 */                                   VarHandle.storeStoreFence();
                                            i0o01i = i0o1o10oo;
                                            break;
                                        }
/* 254 */                               olOilIlol1 = olOilIlol13;
                                    } catch (IOException e) {
/* 299 */                               throw new i0O0lI1oiO(i0o10o13.I00000oIO, e, "Failed to check number of completed merges for session " + i0o10o13.I00000oIO + ", pack " + ((String) i0o10o13.I0000Il00O.I0000O));
                                    }
                                }
/* 302 */                       if (i0o01i == null) {
/* 304 */                           Iterator it3 = arrayList2.iterator();
                                    loop3: while (true) {
/* 312 */                               if (!it3.hasNext()) {
/* 422 */                                   i0o01i = null;
                                            break;
                                        }
/* 318 */                               i0O10o1 i0o10o14 = (i0O10o1) it3.next();
/* 320 */                               i0O1001OIi i0o1001oii3 = i0o10o14.I0000Il00O;
/* 322 */                               int i5 = i0o10o14.I00000oIO;
/* 326 */                               String str4 = (String) i0o1001oii3.I0000O;
/* 334 */                               if (liIoOlIoI1II.I00000oIO(i0o1001oii3.I0000Il00O)) {
/* 340 */                                   Iterator it4 = ((ArrayList) i0o1001oii3.I0001Ioi1lo).iterator();
/* 348 */                                   while (it4.hasNext()) {
/* 354 */                                       i0O11Il0Oo i0o11il0oo = (i0O11Il0Oo) it4.next();
/* 356 */                                       i0Il00O1 i0il00o12 = i0o1o1i.I00000oOI;
/* 362 */                                       String str5 = (String) i0o1001oii3.I0000O;
/* 364 */                                       int i6 = i0o10o14.I00000oOI;
/* 368 */                                       long j3 = i0o1001oii3.I00000oIO;
/* 370 */                                       String str6 = i0o11il0oo.I00000oIO;
/* 388 */                                       if (i0il00o12.I000lI(str5, i6, j3, str6).exists()) {
/* 400 */                                           olOilIlol12.I00000oIO("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(i5), str4, str6);
/* 405 */                                           int i7 = i0o10o14.I00000oOI;
/* 407 */                                           long j4 = i0o1001oii3.I00000oIO;
/* 409 */                                           i0O1ilIi0 i0o1ilii0 = new i0O1ilIi0(i5, str4);
/* 412 */                                           i0o1ilii0.I0000Il00O = i7;
/* 414 */                                           i0o1ilii0.I0000O = j4;
/* 416 */                                           i0o1ilii0.I0000oI00 = str6;
/* 418 */                                           VarHandle.storeStoreFence();
                                                    i0o01i = i0o1ilii0;
                                                    break loop3;
                                                }
                                            }
                                        }
                                    }
/* 423 */                           if (i0o01i == null) {
/* 425 */                               Iterator it5 = arrayList2.iterator();
                                        loop5: while (true) {
/* 433 */                                   if (!it5.hasNext()) {
/* 564 */                                       i0Il00O1 i0il00o13 = i0il00o1;
/* 566 */                                       i0o1i1o = i0o1i1o3;
/* 567 */                                       i0o01i = null;
                                                break;
                                            }
/* 439 */                                   i0O10o1 i0o10o15 = (i0O10o1) it5.next();
/* 441 */                                   i0O1001OIi i0o1001oii4 = i0o10o15.I0000Il00O;
/* 443 */                                   int i8 = i0o10o15.I00000oIO;
/* 447 */                                   String str7 = (String) i0o1001oii4.I0000O;
/* 455 */                                   if (liIoOlIoI1II.I00000oIO(i0o1001oii4.I0000Il00O)) {
/* 461 */                                       Iterator it6 = ((ArrayList) i0o1001oii4.I0001Ioi1lo).iterator();
/* 469 */                                       while (it6.hasNext()) {
/* 475 */                                           i0O11Il0Oo i0o11il0oo2 = (i0O11Il0Oo) it6.next();
/* 477 */                                           boolean zI00000oOI = i0o1o1i.I00000oOI(i0o10o15, i0o11il0oo2);
/* 481 */                                           String str8 = i0o11il0oo2.I00000oIO;
/* 483 */                                           if (zI00000oOI && i0o1o1i.I00000oOI.I000l1((String) i0o1001oii4.I0000O, i0o10o15.I00000oOI, i0o1001oii4.I00000oIO, str8).exists()) {
                                                        break loop5;
                                                    }
                                                }
                                            }
                                        }
/* 568 */                               if (i0o01i == null) {
/* 570 */                                   Iterator it7 = arrayList2.iterator();
                                            loop7: while (true) {
/* 578 */                                       int i9 = 2;
/* 579 */                                       if (!it7.hasNext()) {
/* 828 */                                           i0Iol0l1lIl i0iol0l1lil2 = i0iol0l1lil;
/* 830 */                                           arrayList = arrayList2;
/* 832 */                                           i0o1i1o2 = i0o1i1o;
/* 834 */                                           i0o01i3 = null;
                                                    break;
                                                }
                                                try {
/* 586 */                                           i0O10o1 i0o10o16 = (i0O10o1) it7.next();
/* 588 */                                           i0O1001OIi i0o1001oii5 = i0o10o16.I0000Il00O;
/* 596 */                                           if (liIoOlIoI1II.I00000oIO(i0o1001oii5.I0000Il00O)) {
                                                        try {
/* 602 */                                                   Iterator it8 = ((ArrayList) i0o1001oii5.I0001Ioi1lo).iterator();
/* 610 */                                                   while (it8.hasNext()) {
/* 616 */                                                       i0O11Il0Oo i0o11il0oo3 = (i0O11Il0Oo) it8.next();
/* 618 */                                                       int i10 = i0o11il0oo3.I0001Ioi1lo;
/* 628 */                                                       boolean z = i10 == 1 || i10 == i9;
/* 629 */                                                       int i11 = i0o11il0oo3.I0000oI00;
/* 631 */                                                       ArrayList arrayList3 = i0o11il0oo3.I0000O;
/* 633 */                                                       String str9 = i0o11il0oo3.I00000oIO;
/* 635 */                                                       if (!z) {
/* 639 */                                                           i0Il00O1 i0il00o14 = i0o1o1i.I00000oOI;
/* 641 */                                                           i0O1001OIi i0o1001oii6 = i0o10o16.I0000Il00O;
/* 651 */                                                           arrayList = arrayList2;
                                                                    try {
/* 668 */                                                               iI00000oIO = new i0OIi1oi0i1(i0il00o14, (String) i0o1001oii6.I0000O, i0o10o16.I00000oOI, i0o1001oii6.I00000oIO, i0o11il0oo3.I00000oIO).I00000oIO();
                                                                    } catch (IOException e2) {
/* 680 */                                                               olOilIlol12.I00000oOI("Slice checkpoint corrupt, restarting extraction. %s", e2);
/* 683 */                                                               iI00000oIO = 0;
                                                                    }
/* 685 */                                                           if (iI00000oIO != -1 && ((i0O0olIoi1) arrayList3.get(iI00000oIO)).I00000oIO) {
                                                                        break loop7;
                                                                    }
/* 813 */                                                           i9 = 2;
/* 814 */                                                           i0o1o1i = this;
/* 816 */                                                           arrayList2 = arrayList;
                                                                } else {
/* 820 */                                                           i0o1o1i = this;
                                                                }
                                                            }
                                                        } catch (Throwable th) {
/* 809 */                                                   th = th;
/* 810 */                                                   i0o1i1o2 = i0o1i1o;
/* 798 */                                                   i0o1i1o = i0o1i1o2;
/* 1101 */                                                  i0o1i1o.I0000O.unlock();
/* 2840 */                                                  throw th;
                                                        }
                                                    }
/* 824 */                                           i0o1o1i = this;
                                                } catch (Throwable th2) {
/* 804 */                                           th = th2;
/* 1101 */                                          i0o1i1o.I0000O.unlock();
/* 2840 */                                          throw th;
                                                }
                                            }
/* 835 */                                   if (i0o01i3 == null) {
/* 837 */                                       Iterator it9 = arrayList.iterator();
                                                loop9: while (true) {
/* 845 */                                           if (!it9.hasNext()) {
/* 1070 */                                              i0oi1oo1 = null;
                                                        break;
                                                    }
/* 851 */                                           i0O10o1 i0o10o17 = (i0O10o1) it9.next();
/* 853 */                                           i0O1001OIi i0o1001oii7 = i0o10o17.I0000Il00O;
/* 861 */                                           if (liIoOlIoI1II.I00000oIO(i0o1001oii7.I0000Il00O)) {
/* 867 */                                               Iterator it10 = ((ArrayList) i0o1001oii7.I0001Ioi1lo).iterator();
/* 875 */                                               while (it10.hasNext()) {
/* 881 */                                                   i0O11Il0Oo i0o11il0oo4 = (i0O11Il0Oo) it10.next();
/* 883 */                                                   int i12 = i0o11il0oo4.I0001Ioi1lo;
/* 894 */                                                   boolean z2 = i12 == 1 || i12 == 2;
/* 895 */                                                   String str10 = i0o11il0oo4.I00000oIO;
/* 897 */                                                   if (z2 && ((i0O0olIoi1) i0o11il0oo4.I0000O.get(0)).I00000oIO) {
/* 918 */                                                       if (!I00000oOI(i0o10o17, i0o11il0oo4)) {
                                                                    break loop9;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
/* 1071 */                                      if (i0oi1oo1 != null) {
/* 1081 */                                          i0o1i1o2.I0000O.unlock();
/* 1084 */                                          return i0oi1oo1;
                                                }
/* 1073 */                                      i0o1i1o = i0o1i1o2;
                                            } else {
/* 1085 */                                      i0o1i1o = i0o1i1o2;
/* 1087 */                                      i0o01i2 = i0o01i3;
                                            }
                                        }
                                    } else {
/* 1091 */                              i0o1i1o = i0o1i1o3;
                                    }
/* 1089 */                          i0o01i2 = i0o01i;
                                }
                            }
/* 1095 */                  i0o1i1o.I0000O.unlock();
/* 1098 */                  return i0o01i2;
                        }
/* 65 */                i0o1i1o = i0o1i1o3;
/* 66 */                i0o01i2 = null;
/* 1095 */              i0o1i1o.I0000O.unlock();
/* 1098 */              return i0o01i2;
                    } catch (Throwable th3) {
/* 55 */                th = th3;
/* 56 */                i0o1i1o = i0o1i1o3;
                    }
                }

                public final boolean I00000oOI(i0O10o1 i0o10o1, i0O11Il0Oo i0o11il0oo) throws IOException {
/* 3 */             i0O1001OIi i0o1001oii = i0o10o1.I0000Il00O;
/* 7 */             String str = (String) i0o1001oii.I0000O;
/* 9 */             long j = i0o1001oii.I00000oIO;
/* 11 */            int i = i0o10o1.I00000oOI;
/* 13 */            String str2 = i0o11il0oo.I00000oIO;
/* 15 */            i0Il00O1 i0il00o1 = this.I00000oOI;
/* 17 */            OlOilIlol1 olOilIlol1 = i0OIi1oi0i1.I000O01llI0;
/* 19 */            i0il00o1.getClass();
/* 49 */            File file = new File(new File(new File(new File(i0il00o1.I0000Il00O(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
/* 57 */            if (file.exists()) {
                        try {
/* 62 */                    FileInputStream fileInputStream = new FileInputStream(file);
                            try {
/* 67 */                        Properties properties = new Properties();
/* 70 */                        properties.load(fileInputStream);
/* 73 */                        fileInputStream.close();
/* 82 */                        if (properties.getProperty("fileStatus") == null) {
/* 88 */                            olOilIlol1.I00000oOI("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
/* 56 */                            return false;
                                }
/* 101 */                       if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
/* 103 */                           return true;
                                }
                            } finally {
                            }
                        } catch (IOException e) {
/* 124 */                   olOilIlol1.I00000oOI("Could not read checkpoint while checking if extraction finished. %s", e);
/* 56 */                    return false;
                        }
                    }
/* 56 */            return false;
                }
            }
