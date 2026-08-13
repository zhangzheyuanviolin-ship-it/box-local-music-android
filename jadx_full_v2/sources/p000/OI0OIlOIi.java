            package p000;

            import java.util.ArrayList;
            
            public final class OI0OIlOIi implements IllOOo00lI {
                public final int I00iOIl;
                public I1ii1o0 I00iiI;

                public OI0OIlOIi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v11 */
                /* JADX WARN: Type inference failed for: r0v12 */
                /* JADX WARN: Type inference failed for: r0v15 */
                /* JADX WARN: Type inference failed for: r0v18 */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v9 */
                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             OIoiOI0OI oIoiOI0OI = null;
/* 6 */             int i2 = 1;
/* 7 */             I1ii1o0 i1ii1o0 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 92 */                    ArrayList arrayList = (ArrayList) i1ii1o0.I00ilO0;
/* 98 */                    if (!arrayList.isEmpty()) {
/* 101 */                       ?? r0 = arrayList.get(0);
/* 110 */                       float fI000II = ((OIoiOI0OI) r0).I00000oIO.I000II();
/* 114 */                       int iI000II = IOOi1I.I000II(arrayList);
                                boolean z = r0;
/* 118 */                       if (1 <= iI000II) {
                                    while (true) {
/* 120 */                               Object obj = arrayList.get(i2);
/* 129 */                               float fI000II2 = ((OIoiOI0OI) obj).I00000oIO.I000II();
                                        r0 = z;
/* 137 */                               if (Float.compare(fI000II, fI000II2) < 0) {
/* 139 */                                   r0 = obj;
/* 140 */                                   fI000II = fI000II2;
                                        }
/* 141 */                               if (i2 != iI000II) {
/* 143 */                                   i2++;
                                            z = r0;
                                        }
                                    }
                                }
/* 146 */                       oIoiOI0OI = r0;
                            }
/* 147 */                   OIoiOI0OI oIoiOI0OI2 = oIoiOI0OI;
/* 157 */                   return Float.valueOf(oIoiOI0OI2 != null ? oIoiOI0OI2.I00000oIO.I000II() : 0.0f);
                        default:
/* 14 */                    ArrayList arrayList2 = (ArrayList) i1ii1o0.I00ilO0;
/* 20 */                    if (!arrayList2.isEmpty()) {
/* 23 */                        ?? r02 = arrayList2.get(0);
/* 34 */                        float fI00000oOI = ((OIoiOI0OI) r02).I00000oIO.I00l0OO0IO.I00000oOI();
/* 38 */                        int iI000II2 = IOOi1I.I000II(arrayList2);
                                boolean z2 = r02;
/* 42 */                        if (1 <= iI000II2) {
                                    while (true) {
/* 44 */                                Object obj2 = arrayList2.get(i2);
/* 55 */                                float fI00000oOI2 = ((OIoiOI0OI) obj2).I00000oIO.I00l0OO0IO.I00000oOI();
                                        r02 = z2;
/* 63 */                                if (Float.compare(fI00000oOI, fI00000oOI2) < 0) {
/* 65 */                                    r02 = obj2;
/* 66 */                                    fI00000oOI = fI00000oOI2;
                                        }
/* 67 */                                if (i2 != iI000II2) {
/* 69 */                                    i2++;
                                            z2 = r02;
                                        }
                                    }
                                }
/* 72 */                        oIoiOI0OI = r02;
                            }
/* 73 */                    OIoiOI0OI oIoiOI0OI3 = oIoiOI0OI;
/* 85 */                    return Float.valueOf(oIoiOI0OI3 != null ? oIoiOI0OI3.I00000oIO.I00l0OO0IO.I00000oOI() : 0.0f);
                    }
                }
            }
