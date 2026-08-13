            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            
            public final class O0i1llII {
                public final int I00000oIO;
                public int I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;
                public Object I0000oI00;
                public Object I0001Ioi1lo;
                public Object I000II;
                public Serializable I000O01llI0;

                public static List I00000oOI(int i, HashMap map) {
/* 9 */             O1Iloo0O0 o1Iloo0O0 = (O1Iloo0O0) map.get(Integer.valueOf(i));
/* 11 */            if (o1Iloo0O0 != null) {
/* 13 */                O1Io00oIIO[] o1Io00oIIOArr = o1Iloo0O0.I00000oOI;
/* 16 */                if (o1Io00oIIOArr.length != 0) {
/* 21 */                    ArrayList arrayList = new ArrayList();
/* 26 */                    for (O1Io00oIIO o1Io00oIIO : o1Io00oIIOArr) {
/* 36 */                        arrayList.add(Integer.valueOf(o1Io00oIIO.I00000oIO));
                            }
/* 42 */                    return arrayList;
                        }
                    }
/* 47 */            return Collections.singletonList(Integer.valueOf(i));
                }

                public int I00000oIO() {
/* 7 */             return ((OI1OOIOiOI1) this.I0000Il00O).I00000oIO.getShort();
                }

                public O1Iloo0O0 I0000Il00O(int i) {
                    O1OIll00i o1OIll00i;
/* 3 */             OI1OOIOiOI1 oI1OOIOiOI1 = (OI1OOIOiOI1) this.I0000Il00O;
/* 5 */             ByteBuffer byteBuffer = oI1OOIOiOI1.I00000oIO;
/* 7 */             int iPosition = byteBuffer.position();
/* 11 */            oI1OOIOiOI1.I00000oIO(i);
/* 14 */            int iI00000oIO = I00000oIO();
/* 18 */            int iI00000oIO2 = I00000oIO();
/* 24 */            ArrayList arrayList = new ArrayList();
/* 29 */            for (int i2 = 0; i2 < iI00000oIO2; i2++) {
/* 31 */                int iI00000oIO3 = I00000oIO();
/* 35 */                I00000oIO();
/* 40 */                O1Io00oIIO o1Io00oIIO = new O1Io00oIIO();
/* 43 */                o1Io00oIIO.I00000oIO = iI00000oIO3;
/* 45 */                VarHandle.storeStoreFence();
/* 48 */                arrayList.add(i2, o1Io00oIIO);
                    }
/* 54 */            if (iI00000oIO == 0) {
/* 56 */                o1OIll00i = null;
                    } else {
/* 59 */                int iPosition2 = byteBuffer.position();
/* 63 */                oI1OOIOiOI1.I00000oIO(i + iI00000oIO);
/* 66 */                I00000oIO();
/* 69 */                I00000oIO();
/* 72 */                int iI00000oIO4 = I00000oIO();
/* 78 */                ArrayList arrayList2 = new ArrayList();
/* 82 */                for (int i3 = 0; i3 < iI00000oIO4; i3++) {
/* 84 */                    int iI00000oIO5 = I00000oIO();
/* 88 */                    int iI00000oIO6 = I00000oIO();
/* 92 */                    int iI00000oIO7 = I00000oIO();
/* 96 */                    int iI00000oIO8 = I00000oIO();
/* 100 */                   int iI00000oIO9 = I00000oIO();
/* 106 */                   O1Illo o1Illo = new O1Illo();
/* 109 */                   o1Illo.I00000oIO = iI00000oIO5;
/* 111 */                   o1Illo.I00000oOI = iI00000oIO6;
/* 113 */                   o1Illo.I0000Il00O = iI00000oIO7;
/* 115 */                   o1Illo.I0000O = iI00000oIO8;
/* 117 */                   o1Illo.I0000oI00 = iI00000oIO9;
/* 119 */                   VarHandle.storeStoreFence();
/* 122 */                   arrayList2.add(i3, o1Illo);
                        }
/* 136 */               O1Illo[] o1IlloArr = (O1Illo[]) arrayList2.toArray(new O1Illo[0]);
/* 140 */               o1OIll00i = new O1OIll00i(17);
/* 143 */               o1OIll00i.I00iiI = o1IlloArr;
/* 145 */               VarHandle.storeStoreFence();
/* 148 */               oI1OOIOiOI1.I00000oIO(iPosition2);
                    }
/* 159 */           O1Io00oIIO[] o1Io00oIIOArr = (O1Io00oIIO[]) arrayList.toArray(new O1Io00oIIO[0]);
/* 161 */           O1Iloo0O0 o1Iloo0O0 = new O1Iloo0O0();
/* 164 */           o1Iloo0O0.I00000oIO = o1OIll00i;
/* 166 */           o1Iloo0O0.I00000oOI = o1Io00oIIOArr;
/* 168 */           VarHandle.storeStoreFence();
/* 171 */           oI1OOIOiOI1.I00000oIO(iPosition);
/* 186 */           return o1Iloo0O0;
                }

                public Integer[] I0000O(int i) throws Exception {
                    Integer[] numArr;
/* 3 */             OI1OOIOiOI1 oI1OOIOiOI1 = (OI1OOIOiOI1) this.I0000Il00O;
/* 7 */             int iPosition = oI1OOIOiOI1.I00000oIO.position();
/* 11 */            oI1OOIOiOI1.I00000oIO(i);
/* 14 */            int iI00000oIO = I00000oIO();
/* 20 */            if (iI00000oIO == 1) {
/* 86 */                int iI00000oIO2 = I00000oIO();
/* 90 */                Integer[] numArr2 = new Integer[iI00000oIO2];
/* 93 */                for (int i2 = 0; i2 < iI00000oIO2; i2++) {
/* 99 */                    numArr2[i2] = 0;
                        }
/* 104 */               for (int i3 = 0; i3 < iI00000oIO2; i3++) {
/* 114 */                   numArr2[i3] = Integer.valueOf(I00000oIO());
                        }
/* 119 */               numArr = numArr2;
                    } else {
/* 23 */                if (iI00000oIO != 2) {
/* 85 */                    throw new Exception("Invalid coverage format");
                        }
/* 25 */                int iI00000oIO3 = I00000oIO();
/* 31 */                ArrayList arrayList = new ArrayList();
/* 35 */                for (int i4 = 0; i4 < iI00000oIO3; i4++) {
/* 37 */                    int iI00000oIO4 = I00000oIO();
/* 41 */                    int iI00000oIO5 = I00000oIO();
/* 45 */                    int iI00000oIO6 = I00000oIO();
/* 49 */                    if (iI00000oIO4 <= iI00000oIO5) {
                                while (true) {
/* 51 */                            int i5 = iI00000oIO6 + 1;
/* 57 */                            arrayList.add(iI00000oIO6, Integer.valueOf(iI00000oIO4));
/* 60 */                            if (iI00000oIO4 != iI00000oIO5) {
/* 62 */                                iI00000oIO4++;
/* 64 */                                iI00000oIO6 = i5;
                                    }
                                }
                            }
                        }
/* 75 */                numArr = (Integer[]) arrayList.toArray(new Integer[0]);
                    }
/* 120 */           oI1OOIOiOI1.I00000oIO(iPosition);
/* 186 */           return numArr;
                }

                public void I0000oI00(int i, HashMap map) throws Exception {
/* 5 */             ((OI1OOIOiOI1) this.I0000Il00O).I00000oIO(i);
/* 13 */            Integer[] numArrI0000O = I0000O(I00000oIO() + i);
/* 17 */            int iI00000oIO = I00000oIO();
/* 22 */            for (int i2 = 0; i2 < iI00000oIO; i2++) {
/* 24 */                Integer num = numArrI0000O[i2];
/* 26 */                int iI00000oIO2 = I00000oIO();
/* 30 */                I00000oIO();
/* 37 */                map.put(num, Integer.valueOf(iI00000oIO2));
                    }
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 0:
/* 35 */                    return ((O0i1lIiil) this.I0000Il00O) + " version=" + ((O1lili011o) this.I0000O);
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
