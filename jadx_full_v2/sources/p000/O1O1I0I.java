            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import io.github.darriousliu.katex.freetype.FreeTypeAndroid;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public final class O1O1I0I {
                public O1IlIoIOOIi I00000oIO;
                public boolean I00000oOI;
                public boolean I0000Il00O;
                public ArrayList I0000O;
                public IIOl10ol0 I0000oI00;
                public String I0001Ioi1lo;
                public ArrayList I000II;
                public OI1IO0IiiI I000O01llI0;
                public O1IlIoIOOIi I000OOo1O;
                public O1IoI1l1IIo0 I000OiO;

                public static float I000O01llI0(II1i0i0ilO iI1i0i0ilO) {
/* 2 */             if (iI1i0i0ilO == null) {
/* 1 */                 return 0.0f;
                    }
/* 15 */            return Math.max(0.0f, 0.0f - Math.min(iI1i0i0ilO.I0000oI00, iI1i0i0ilO.I0000Il00O));
                }

                public static float I000OiO(O1IoI1l1IIo0 o1IoI1l1IIo0, O1IlIoIOOIi o1IlIoIOOIi) {
/* 1 */             float f = o1IlIoIOOIi.I00000oIO;
/* 3 */             O1Ill0ioO10 o1Ill0ioO10 = o1IlIoIOOIi.I00000oOI;
/* 5 */             int iOrdinal = o1IoI1l1IIo0.ordinal();
/* 9 */             if (iOrdinal == 0 || iOrdinal == 1) {
/* 89 */                return f;
                    }
/* 17 */            if (iOrdinal == 2) {
/* 69 */                return (((Number) ((HashMap) o1Ill0ioO10.I0000oI00.I0000O).get("ScriptPercentScaleDown")).intValue() / 100.0f) * f;
                    }
/* 20 */            if (iOrdinal == 3) {
/* 42 */                return (((Number) ((HashMap) o1Ill0ioO10.I0000oI00.I0000O).get("ScriptScriptPercentScaleDown")).intValue() / 100.0f) * f;
                    }
/* 44 */            I000II.I00000oIO();
/* 47 */            return 0.0f;
                }

                public static boolean I000iOII(O1Il1I0OOii o1Il1I0OOii) {
                    int i;
/* 1 */             O1IooO o1IooO = o1Il1I0OOii.I000OOo1O;
/* 4 */             if (o1IooO != null && o1IooO.I00000oIO.size() == 1) {
/* 24 */                O1IoOOii0Ioi o1IoOOii0Ioi = (O1IoOOii0Ioi) o1Il1I0OOii.I000OOo1O.I00000oIO.get(0);
/* 26 */                String str = o1IoOOii0Ioi.I00000oOI;
/* 28 */                int length = str.length();
/* 36 */                if (str.length() < 0) {
/* 102 */                   I000II.I000iOII("beginIndex out of range");
                        } else {
/* 38 */                    if (length < 0 || length > str.length()) {
/* 96 */                        I000II.I000iOII("endIndex out of range");
/* 3 */                         return false;
                            }
/* 46 */                    int i2 = 0;
/* 47 */                    int i3 = 0;
/* 48 */                    while (i2 < length) {
/* 77 */                        i2 += (Character.isHighSurrogate(str.charAt(i2)) && (i = i2 + 1) < length && Character.isLowSurrogate(str.charAt(i))) ? 2 : 1;
/* 78 */                        i3++;
                            }
/* 81 */                    if (i3 == 1 && o1IoOOii0Ioi.I0000O == null && o1IoOOii0Ioi.I0000Il00O == null) {
/* 12 */                        return true;
                            }
                        }
                    }
/* 3 */             return false;
                }

                public final O1Il1i0oOooo I00000oIO() {
/* 11 */            O1Il1i0oOooo o1Il1i0oOooo = new O1Il1i0oOooo(this.I0001Ioi1lo, this.I000O01llI0, this.I000OOo1O, this.I000II);
/* 14 */            IIOl10ol0 iIOl10ol0 = this.I0000oI00;
/* 16 */            o1Il1i0oOooo.I000II(iIOl10ol0);
/* 21 */            this.I0000O.add(o1Il1i0oOooo);
                    iIOl10ol0.I00000oIO += o1Il1i0oOooo.I0000Il00O;
/* 33 */            this.I0001Ioi1lo = "";
/* 40 */            this.I000II = new ArrayList();
/* 47 */            this.I000O01llI0 = new OI1IO0IiiI();
/* 113 */           return o1Il1i0oOooo;
                }

                public final void I00000oOI(O1IoOOii0Ioi o1IoOOii0Ioi, O1IoiiO0o1 o1IoiiO0o1) {
/* 21 */            float fI000OOo1O = o1IoOOii0Ioi != null ? I000OOo1O(o1IoOOii0Ioi.I00000oIO, o1IoiiO0o1) : this.I0000Il00O ? I000OOo1O(O1IoiiO0o1.I00l0I0l0lO1, o1IoiiO0o1) : 0.0f;
                    this.I0000oI00.I00000oIO += fI000OOo1O;
                }

                public final O1IlII1o1O0i I0000Il00O(O1IlII1o1O0i o1IlII1o1O0i, O1Io1i0i o1Io1i0i, float f) throws O1Ooo1IIioo {
/* 1 */             O1IlIoIOOIi o1IlIoIOOIi = this.I00000oIO;
/* 3 */             IIOl10ol0 iIOl10ol0 = this.I0000oI00;
/* 7 */             if (o1Io1i0i.I0000O == null && o1Io1i0i.I0000Il00O == null) {
/* 20 */                iIOl10ol0.I00000oIO = o1IlII1o1O0i.I0000oI00() + iIOl10ol0.I00000oIO;
/* 22 */                return o1IlII1o1O0i;
                    }
/* 25 */            if (!o1Io1i0i.I000OOo1O || this.I000OiO != O1IoI1l1IIo0.I00iOIl) {
/* 214 */               iIOl10ol0.I00000oIO = o1IlII1o1O0i.I0000oI00() + iIOl10ol0.I00000oIO;
/* 218 */               int i = o1Io1i0i.I000II.I00000oIO;
/* 220 */               I000lI(o1Io1i0i, o1IlII1o1O0i, f);
/* 2160 */              return o1IlII1o1O0i;
                    }
/* 33 */            O1IooO o1IooO = o1Io1i0i.I0000Il00O;
/* 50 */            O1O00IIOio1l o1O00IIOio1lI00000oOI = o1IooO != null ? l11ioolOl1oO.I00000oOI(o1IooO, o1IlIoIOOIi, I000o00OoI0I(), this.I00000oOI, false) : null;
/* 51 */            O1IooO o1IooO2 = o1Io1i0i.I0000O;
/* 65 */            O1O00IIOio1l o1O00IIOio1lI00000oOI2 = o1IooO2 != null ? l11ioolOl1oO.I00000oOI(o1IooO2, o1IlIoIOOIi, I000o00OoI0I(), true, false) : null;
/* 66 */            if (o1O00IIOio1lI00000oOI == null && o1O00IIOio1lI00000oOI2 == null) {
/* 73 */                I000II.I000iOII("Failed requirement.");
/* 36 */                return null;
                    }
/* 84 */            O1Io10Ol1 o1Io10Ol1 = new O1Io10Ol1(null, 31, 0);
/* 87 */            o1Io10Ol1.I000iOII = o1IlII1o1O0i;
/* 89 */            o1Io10Ol1.I000OiO = o1O00IIOio1lI00000oOI;
/* 91 */            o1Io10Ol1.I000lI = o1O00IIOio1lI00000oOI2;
/* 93 */            o1Io10Ol1.I000l1 = f / 2.0f;
/* 95 */            float fI0000oI00 = o1IlII1o1O0i.I0000oI00();
/* 99 */            if (o1O00IIOio1lI00000oOI != null) {
/* 103 */               fI0000oI00 = Math.max(fI0000oI00, o1O00IIOio1lI00000oOI.I0000Il00O);
                    }
/* 107 */           if (o1O00IIOio1lI00000oOI2 != null) {
/* 111 */               fI0000oI00 = Math.max(fI0000oI00, o1O00IIOio1lI00000oOI2.I0000Il00O);
                    }
/* 115 */           o1Io10Ol1.I0000Il00O = fI0000oI00;
/* 117 */           VarHandle.storeStoreFence();
/* 120 */           if (o1O00IIOio1lI00000oOI != null) {
/* 149 */               o1Io10Ol1.I000oI1ioi = Math.max(this.I000OOo1O.I00000oOI.I00000oIO("UpperLimitGapMin"), this.I000OOo1O.I00000oOI.I00000oIO("UpperLimitBaselineRiseMin") - o1O00IIOio1lI00000oOI.I00000oOI);
/* 151 */               o1Io10Ol1.I000l1();
                    }
/* 154 */           if (o1O00IIOio1lI00000oOI2 != null) {
/* 183 */               o1Io10Ol1.I000o00OoI0I = Math.max(this.I000OOo1O.I00000oOI.I00000oIO("LowerLimitGapMin"), this.I000OOo1O.I00000oOI.I00000oIO("LowerLimitBaselineDropMin") - o1O00IIOio1lI00000oOI2.I00000oIO);
/* 185 */               o1Io10Ol1.I000OiO();
                    }
/* 188 */           o1Io10Ol1.I000II(iIOl10ol0);
/* 197 */           o1Io10Ol1.I0000O = OI1IO0IiiI.I00000oIO(o1Io1i0i.I000II);
                    iIOl10ol0.I00000oIO += o1Io10Ol1.I0000Il00O;
/* 206 */           return o1Io10Ol1;
                }

                public final O1Io0Il I0000O(IIOl0O0 iIOl0O0, float f) {
                    ArrayList<O1Io0Io1oo11> arrayList;
                    int i;
                    float f2;
/* 5 */             O1Ill0ioO10 o1Ill0ioO10 = this.I000OOo1O.I00000oOI;
/* 25 */            O1Iloo0O0 o1Iloo0O0 = (O1Iloo0O0) ((HashMap) o1Ill0ioO10.I0000oI00.I000II).get(Integer.valueOf(iIOl0O0.I00000oIO));
/* 41 */            O1Illo[] o1IlloArr = (o1Iloo0O0 != null ? o1Iloo0O0.I00000oIO : null) == null ? null : (O1Illo[]) o1Iloo0O0.I00000oIO.I00iiI;
/* 43 */            int i2 = 0;
/* 45 */            if (o1IlloArr == null) {
/* 47 */                arrayList = null;
                    } else {
/* 51 */                arrayList = new ArrayList();
/* 56 */                for (O1Illo o1Illo : o1IlloArr) {
/* 62 */                    int i3 = o1Illo.I00000oIO;
/* 66 */                    float fI00000oOI = o1Ill0ioO10.I00000oOI(o1Illo.I0000O);
/* 72 */                    float fI00000oOI2 = o1Ill0ioO10.I00000oOI(o1Illo.I00000oOI);
/* 78 */                    float fI00000oOI3 = o1Ill0ioO10.I00000oOI(o1Illo.I0000Il00O);
/* 88 */                    boolean z = o1Illo.I0000oI00 == 1;
/* 89 */                    O1Io0Io1oo11 o1Io0Io1oo11 = new O1Io0Io1oo11();
/* 92 */                    o1Io0Io1oo11.I00000oIO = i3;
/* 94 */                    o1Io0Io1oo11.I00000oOI = fI00000oOI;
/* 96 */                    o1Io0Io1oo11.I0000Il00O = fI00000oOI2;
/* 98 */                    o1Io0Io1oo11.I0000O = fI00000oOI3;
/* 100 */                   o1Io0Io1oo11.I0000oI00 = z;
/* 102 */                   VarHandle.storeStoreFence();
/* 105 */                   arrayList.add(o1Io0Io1oo11);
                        }
                    }
/* 111 */           if (arrayList == null || arrayList.size() == 0) {
/* 119 */               return null;
                    }
/* 125 */           ArrayList arrayList2 = new ArrayList(0);
/* 130 */           ArrayList arrayList3 = new ArrayList(0);
/* 133 */           int i4 = 0;
                    while (true) {
/* 136 */               O1Ill0ioO10 o1Ill0ioO102 = this.I000OOo1O.I00000oOI;
/* 142 */               float fI00000oOI4 = o1Ill0ioO102.I00000oOI(o1Ill0ioO102.I0000oI00.I00000oOI);
/* 146 */               arrayList2.clear();
/* 149 */               arrayList3.clear();
/* 156 */               float fMin = 1000000.0f;
/* 159 */               O1Io0Io1oo11 o1Io0Io1oo112 = null;
/* 160 */               float f3 = 0.0f;
/* 165 */               for (O1Io0Io1oo11 o1Io0Io1oo113 : arrayList) {
/* 179 */                   int i5 = o1Io0Io1oo113.I0000oI00 ? i4 : 1;
/* 180 */                   int i6 = i2;
/* 182 */                   while (i2 < i5) {
/* 192 */                       arrayList2.add(Integer.valueOf(o1Io0Io1oo113.I00000oIO));
/* 195 */                       if (o1Io0Io1oo112 != null) {
/* 201 */                           float fMin2 = Math.min(o1Io0Io1oo112.I0000O, o1Io0Io1oo113.I0000Il00O);
/* 205 */                           float f4 = o1Io0Io1oo112.I00000oOI;
/* 207 */                           float f5 = f4 - fMin2;
/* 211 */                           fMin = Math.min(fMin, (f4 - fI00000oOI4) - f5);
/* 215 */                           f3 += f5;
                                }
/* 220 */                       arrayList3.add(Float.valueOf(f3));
/* 223 */                       i2++;
/* 225 */                       o1Io0Io1oo112 = o1Io0Io1oo113;
                            }
/* 227 */                   i2 = i6;
                        }
/* 230 */               i = i2;
/* 234 */               if (o1Io0Io1oo112 != null) {
/* 241 */                   float f6 = o1Io0Io1oo112.I00000oOI;
/* 243 */                   f2 = f3 + f6;
/* 251 */                   float size = (fMin * (arrayList2.size() - 1)) + f2;
/* 254 */                   if (f2 >= f) {
                                break;
                            }
/* 259 */                   if (f <= size) {
/* 269 */                       float size2 = (f - f2) / (arrayList2.size() - 1);
/* 270 */                       int size3 = arrayList3.size();
/* 276 */                       float fFloatValue = 0.0f;
/* 278 */                       for (int i7 = i; i7 < size3; i7++) {
/* 292 */                           fFloatValue = ((Number) arrayList3.get(i7)).floatValue() + (i7 * size2);
/* 297 */                           arrayList3.set(i7, Float.valueOf(fFloatValue));
                                }
/* 303 */                       f2 = fFloatValue + f6;
                            }
                        }
/* 236 */               i4++;
/* 238 */               i2 = i;
                    }
/* 309 */           Float[] fArr = {Float.valueOf(0.0f)};
/* 321 */           this.I000OOo1O.I00000oOI.I0000O(IOOi0Ool1i.I00iIi0i1o(arrayList2), fArr, 1);
/* 326 */           O1IlIoIOOIi o1IlIoIOOIi = this.I000OOo1O;
/* 331 */           O1Io0Il o1Io0Il = new O1Io0Il(null, 31);
/* 334 */           o1Io0Il.I000OOo1O = arrayList2;
/* 336 */           o1Io0Il.I000OiO = arrayList3;
/* 338 */           o1Io0Il.I000iOII = o1IlIoIOOIi;
/* 348 */           if (arrayList2.size() != arrayList3.size()) {
/* 370 */               I000II.I000iOII("Failed requirement.");
/* 373 */               return null;
                    }
/* 350 */           VarHandle.storeStoreFence();
/* 359 */           o1Io0Il.I0000Il00O = fArr[i].floatValue();
/* 361 */           o1Io0Il.I00000oIO = f2;
/* 365 */           o1Io0Il.I00000oOI = 0.0f;
/* 367 */           return o1Io0Il;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:308:0x098e  */
                /* JADX WARN: Type inference failed for: r10v67, types: [O1Il1i0, O1IlII1o1O0i] */
                /* JADX WARN: Type inference failed for: r1v31, types: [O1IlII1o1O0i, O1O00IIOio1l] */
                /* JADX WARN: Type inference failed for: r32v0, types: [O1O1I0I] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00(ArrayList arrayList) {
                    boolean z;
                    O1IlIoIOOIi o1IlIoIOOIi;
                    Float f;
                    Iterator it;
                    float fI00000oOI;
                    boolean z2;
                    O1IlII1o1O0i o1IlII1o1O0iI0000Il00O;
                    int nameIndex;
                    O1IoI1l1IIo0 o1IoI1l1IIo0;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    boolean z3;
                    float f6;
                    float f7;
                    O1O00IIOio1l o1O00IIOio1l;
                    O1Io1iOoiO1 o1Io1iOoiO1;
                    O1Io1iOoiO1 o1Io1iOoiO12;
                    O1O00IIOio1l o1O00IIOio1lI00000oOI;
                    float f8;
                    float fI0001Ioi1lo;
                    float f9;
                    int i;
                    II1i0i0ilO[] iI1i0i0ilOArr;
                    O1O00IIOio1l o1O00IIOio1l2;
                    float f10;
                    int i2;
                    float f11;
                    O1IlII1o1O0i[][] o1IlII1o1O0iArr;
                    float fI0000oI00;
                    Float f12;
                    Iterator it2;
/* 3 */             boolean z4 = this.I00000oOI;
/* 5 */             O1IlIoIOOIi o1IlIoIOOIi2 = this.I00000oIO;
/* 7 */             ArrayList arrayList2 = this.I0000O;
/* 10 */            Float fValueOf = Float.valueOf(0.0f);
/* 14 */            IIOl10ol0 iIOl10ol0 = this.I0000oI00;
/* 16 */            O1IoiiO0o1 o1IoiiO0o1 = O1IoiiO0o1.I00iOIl;
/* 18 */            Iterator it3 = arrayList.iterator();
/* 22 */            O1IoOOii0Ioi o1IoOOii0Ioi = null;
/* 27 */            while (it3.hasNext()) {
/* 33 */                O1IoOOii0Ioi o1IoOOii0Ioi2 = (O1IoOOii0Ioi) it3.next();
/* 35 */                O1IoiiO0o1 o1IoiiO0o12 = o1IoOOii0Ioi2.I00000oIO;
/* 37 */                ArrayList arrayList3 = o1IoOOii0Ioi2.I0001Ioi1lo;
                        switch (o1IoiiO0o12.ordinal()) {
                            case 0:
/* 3152 */                      z = z4;
/* 3154 */                      o1IlIoIOOIi = o1IlIoIOOIi2;
/* 3156 */                      f = fValueOf;
/* 3158 */                      it = it3;
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                            case 1:
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 12:
                            case 13:
/* 2955 */                      z = z4;
/* 2957 */                      o1IlIoIOOIi = o1IlIoIOOIi2;
/* 2959 */                      f = fValueOf;
/* 2961 */                      it = it3;
/* 2971 */                      if (this.I0001Ioi1lo.length() > 0) {
/* 2973 */                          I00000oIO();
                                }
/* 2976 */                      if (o1IoOOii0Ioi != null) {
/* 2982 */                          float fI000OOo1O = I000OOo1O(o1IoOOii0Ioi.I00000oIO, o1IoOOii0Ioi2.I00000oIO);
/* 2992 */                          if (this.I0001Ioi1lo.length() <= 0 || fI000OOo1O > 0.0f) {
                                        iIOl10ol0.I00000oIO += fI000OOo1O;
                                    }
                                }
/* 3019 */                      this.I0001Ioi1lo = Oi010OO0.I00111O(this.I0001Ioi1lo, o1IoOOii0Ioi2.I00000oOI);
/* 3021 */                      OI1IO0IiiI oI1IO0IiiI = this.I000O01llI0;
/* 3026 */                      if (oI1IO0IiiI.I00000oIO == -1) {
/* 3028 */                          OI1IO0IiiI oI1IO0IiiI2 = o1IoOOii0Ioi2.I000II;
/* 3032 */                          oI1IO0IiiI.I00000oIO = oI1IO0IiiI2.I00000oIO;
/* 3036 */                          oI1IO0IiiI.I00000oOI = oI1IO0IiiI2.I00000oOI;
                                } else {
                                    oI1IO0IiiI.I00000oOI += o1IoOOii0Ioi2.I000II.I00000oOI;
                                }
/* 3048 */                      int size = arrayList3.size();
/* 3052 */                      ArrayList arrayList4 = this.I000II;
/* 3054 */                      if (size > 0) {
/* 3056 */                          arrayList4.addAll(arrayList3);
                                } else {
/* 3060 */                          arrayList4.add(o1IoOOii0Ioi2);
                                }
/* 3065 */                      if (o1IoOOii0Ioi2.I0000O == null && o1IoOOii0Ioi2.I0000Il00O == null) {
/* 673 */                           z2 = false;
                                } else {
/* 3071 */                          O1Il1i0oOooo o1Il1i0oOoooI00000oIO = I00000oIO();
/* 3081 */                          if (o1IoOOii0Ioi2.I00000oOI.length() > 0) {
/* 3087 */                              IIOl0O0 iIOl0O0I00000oOI = this.I000OOo1O.I00000oOI(o1IoOOii0Ioi2.I00000oOI);
/* 3093 */                              O1Ill0ioO10 o1Ill0ioO10 = this.I000OOo1O.I00000oOI;
/* 3111 */                              Integer num = (Integer) ((HashMap) o1Ill0ioO10.I0000oI00.I0000oI00).get(Integer.valueOf(iIOl0O0I00000oOI.I00000oIO));
/* 3122 */                              fI00000oOI = o1Ill0ioO10.I00000oOI(num != null ? num.intValue() : 0);
                                    } else {
/* 3129 */                              fI00000oOI = 0.0f;
                                    }
/* 3126 */                          z2 = false;
/* 3133 */                          if (fI00000oOI > 0.0f && o1IoOOii0Ioi2.I0000O == null) {
                                        iIOl10ol0.I00000oIO += fI00000oOI;
                                    }
/* 3146 */                          int i3 = o1IoOOii0Ioi2.I000II.I00000oIO;
/* 3148 */                          I000lI(o1IoOOii0Ioi2, o1Il1i0oOoooI00000oIO, fI00000oOI);
                                }
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                                break;
                            case 2:
                            case 3:
                            case 6:
/* 2954 */                      throw new O1Ooo1IIioo("These types should never show here as they are removed by preprocessing");
                            case 4:
/* 2608 */                      z = z4;
/* 2610 */                      o1IlIoIOOIi = o1IlIoIOOIi2;
/* 2612 */                      f = fValueOf;
/* 2614 */                      it = it3;
/* 2622 */                      if (this.I0001Ioi1lo.length() > 0) {
/* 2624 */                          I00000oIO();
                                }
/* 2629 */                      I00000oOI(o1IoOOii0Ioi, o1IoOOii0Ioi2.I00000oIO);
/* 2633 */                      O1Io1i0i o1Io1i0i = (O1Io1i0i) o1IoOOii0Ioi2;
/* 2647 */                      boolean z5 = o1Io1i0i.I000OOo1O && this.I000OiO == O1IoI1l1IIo0.I00iOIl;
/* 2655 */                      if (o1Io1i0i.I00000oOI.length() == 1) {
/* 2661 */                          IIOl0O0 iIOl0O0I00000oOI2 = this.I000OOo1O.I00000oOI(o1Io1i0i.I00000oOI);
/* 2669 */                          if (this.I000OiO == O1IoI1l1IIo0.I00iOIl && (nameIndex = iIOl0O0I00000oOI2.I00000oIO) != 0) {
/* 2679 */                              O1Ill0ioO10 o1Ill0ioO102 = this.I000OOo1O.I00000oOI;
/* 2681 */                              Il1oollOO1iI il1oollOO1iI = o1Ill0ioO102.I0000O;
/* 2683 */                              Il1oollOO1iI il1oollOO1iI2 = o1Ill0ioO102.I0000O;
/* 2685 */                              il1oollOO1iI.getClass();
/* 2692 */                              String glyphName = IoOil1.I00000oIO.getGlyphName(il1oollOO1iI.I00000oIO, nameIndex);
/* 2706 */                              Iterator it4 = O0i1llII.I00000oOI(nameIndex, (HashMap) o1Ill0ioO102.I0000oI00.I000II).iterator();
                                        while (true) {
/* 2714 */                                  if (it4.hasNext()) {
/* 2722 */                                      int iIntValue = ((Number) it4.next()).intValue();
/* 2726 */                                      il1oollOO1iI2.getClass();
/* 2729 */                                      FreeTypeAndroid freeTypeAndroid = IoOil1.I00000oIO;
/* 2733 */                                      String glyphName2 = freeTypeAndroid.getGlyphName(il1oollOO1iI2.I00000oIO, iIntValue);
/* 2741 */                                      if (!O0000Ioio00.I0000O(glyphName2, glyphName)) {
/* 2743 */                                          il1oollOO1iI2.getClass();
/* 2748 */                                          nameIndex = freeTypeAndroid.getNameIndex(il1oollOO1iI2.I00000oIO, glyphName2);
                                                }
                                            }
                                        }
/* 2754 */                              iIOl0O0I00000oOI2 = new IIOl0O0(nameIndex, 14);
                                    }
/* 2759 */                          O1Ill0ioO10 o1Ill0ioO103 = this.I000OOo1O.I00000oOI;
/* 2777 */                          Integer num2 = (Integer) ((HashMap) o1Ill0ioO103.I0000oI00.I0000oI00).get(Integer.valueOf(iIOl0O0I00000oOI2.I00000oIO));
/* 2787 */                          float fI00000oOI2 = o1Ill0ioO103.I00000oOI(num2 != null ? num2.intValue() : 0);
/* 2792 */                          II1i0i0ilO[] iI1i0i0ilOArr2 = new II1i0i0ilO[1];
/* 2794 */                          Float[] fArr = {f};
/* 2804 */                          List listSingletonList = Collections.singletonList(Integer.valueOf(iIOl0O0I00000oOI2.I00000oIO));
/* 2813 */                          List list = listSingletonList;
/* 2819 */                          this.I000OOo1O.I00000oOI.I0000oI00(listSingletonList, iI1i0i0ilOArr2, list.size());
/* 2830 */                          this.I000OOo1O.I00000oOI.I0000O(listSingletonList, fArr, list.size());
/* 2835 */                          II1i0i0ilO iI1i0i0ilO = iI1i0i0ilOArr2[0];
/* 2850 */                          float fMax = iI1i0i0ilO == null ? 0.0f : Math.max(0.0f, Math.max(iI1i0i0ilO.I0000oI00, iI1i0i0ilO.I0000Il00O));
/* 2856 */                          float fI000O01llI0 = I000O01llI0(iI1i0i0ilOArr2[0]);
/* 2872 */                          float fI00000oIO = ((fMax - fI000O01llI0) * 0.5f) - this.I000OOo1O.I00000oOI.I00000oIO("AxisHeight");
/* 2879 */                          O1Il1i0 o1Il1i0 = new O1Il1i0(iIOl0O0I00000oOI2, o1Io1i0i.I000II, this.I000OOo1O);
/* 2882 */                          o1Il1i0.I00000oIO = fMax;
/* 2884 */                          o1Il1i0.I00000oOI = fI000O01llI0;
/* 2890 */                          float fFloatValue = fArr[0].floatValue();
/* 2894 */                          o1Il1i0.I0000Il00O = fFloatValue;
/* 2898 */                          if (o1Io1i0i.I0000O != null && !z5) {
/* 2903 */                              o1Il1i0.I0000Il00O = fFloatValue - fI00000oOI2;
                                    }
/* 2905 */                          o1Il1i0.I0000oI00 = fI00000oIO;
/* 2907 */                          o1Il1i0.I000II(iIOl10ol0);
/* 2910 */                          o1IlII1o1O0iI0000Il00O = I0000Il00O(o1Il1i0, o1Io1i0i, fI00000oOI2);
                                } else {
/* 2917 */                          ArrayList arrayList5 = new ArrayList();
/* 2920 */                          arrayList5.add(o1Io1i0i);
/* 2931 */                          O1Il1i0oOooo o1Il1i0oOooo = new O1Il1i0oOooo(o1Io1i0i.I00000oOI, o1Io1i0i.I000II, this.I000OOo1O, arrayList5);
/* 2934 */                          o1Il1i0oOooo.I000II(iIOl10ol0);
/* 2938 */                          o1IlII1o1O0iI0000Il00O = I0000Il00O(o1Il1i0oOooo, o1Io1i0i, 0.0f);
                                }
/* 2942 */                      arrayList2.add(o1IlII1o1O0iI0000Il00O);
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                                break;
                            case 10:
/* 2094 */                      f = fValueOf;
/* 2096 */                      it = it3;
/* 2105 */                      if (this.I0001Ioi1lo.length() > 0) {
/* 2107 */                          I00000oIO();
                                }
/* 2111 */                      O1IllIIlII1 o1IllIIlII1 = (O1IllIIlII1) o1IoOOii0Ioi2;
/* 2115 */                      I00000oOI(o1IoOOii0Ioi, o1IoOOii0Ioi2.I00000oIO);
/* 2118 */                      O1IoI1l1IIo0 o1IoI1l1IIo02 = O1IoI1l1IIo0.I00iOIl;
/* 2122 */                      int iOrdinal = this.I000OiO.ordinal();
/* 2126 */                      if (iOrdinal == 0) {
/* 2148 */                          o1IoI1l1IIo0 = O1IoI1l1IIo0.I00iiI;
                                } else if (iOrdinal == 1) {
/* 2145 */                          o1IoI1l1IIo0 = O1IoI1l1IIo0.I00iiO;
                                } else {
/* 2132 */                          if (iOrdinal != 2 && iOrdinal != 3) {
/* 2138 */                              I000II.I00000oIO();
/* 2141 */                              return;
                                    }
/* 2142 */                          o1IoI1l1IIo0 = O1IoI1l1IIo0.I00iio;
                                }
/* 2153 */                      O1O00IIOio1l o1O00IIOio1lI00000oOI2 = l11ioolOl1oO.I00000oOI(o1IllIIlII1.I000OOo1O, o1IlIoIOOIi2, o1IoI1l1IIo0, false, false);
/* 2160 */                      O1O00IIOio1l o1O00IIOio1lI00000oOI3 = l11ioolOl1oO.I00000oOI(o1IllIIlII1.I000OiO, o1IlIoIOOIi2, o1IoI1l1IIo0, true, false);
/* 2164 */                      boolean z6 = o1IllIIlII1.I000iOII;
/* 2166 */                      O1IoI1l1IIo0 o1IoI1l1IIo03 = this.I000OiO;
/* 2168 */                      O1IlIoIOOIi o1IlIoIOOIi3 = this.I000OOo1O;
/* 2207 */                      float fI00000oIO2 = z6 ? o1IoI1l1IIo03 == o1IoI1l1IIo02 ? o1IlIoIOOIi3.I00000oOI.I00000oIO("FractionNumeratorDisplayStyleShiftUp") : o1IlIoIOOIi3.I00000oOI.I00000oIO("FractionNumeratorShiftUp") : o1IoI1l1IIo03 == o1IoI1l1IIo02 ? o1IlIoIOOIi3.I00000oOI.I00000oIO("StackTopDisplayStyleShiftUp") : o1IlIoIOOIi3.I00000oOI.I00000oIO("StackTopShiftUp");
/* 2211 */                      boolean z7 = o1IllIIlII1.I000iOII;
/* 2213 */                      O1IoI1l1IIo0 o1IoI1l1IIo04 = this.I000OiO;
/* 2215 */                      O1IlIoIOOIi o1IlIoIOOIi4 = this.I000OOo1O;
/* 2254 */                      float fI00000oIO3 = z7 ? o1IoI1l1IIo04 == o1IoI1l1IIo02 ? o1IlIoIOOIi4.I00000oOI.I00000oIO("FractionDenominatorDisplayStyleShiftDown") : o1IlIoIOOIi4.I00000oOI.I00000oIO("FractionDenominatorShiftDown") : o1IoI1l1IIo04 == o1IoI1l1IIo02 ? o1IlIoIOOIi4.I00000oOI.I00000oIO("StackBottomDisplayStyleShiftDown") : o1IlIoIOOIi4.I00000oOI.I00000oIO("StackBottomShiftDown");
/* 2262 */                      float fI00000oIO4 = this.I000OOo1O.I00000oOI.I00000oIO("AxisHeight");
/* 2281 */                      float fI00000oIO5 = o1IllIIlII1.I000iOII ? this.I000OOo1O.I00000oOI.I00000oIO("FractionRuleThickness") : 0.0f;
/* 2282 */                      boolean z8 = o1IllIIlII1.I000iOII;
/* 2284 */                      float f13 = o1O00IIOio1lI00000oOI2.I00000oOI;
/* 2286 */                      if (z8) {
/* 2290 */                          float f14 = fI00000oIO5 / 2.0f;
/* 2294 */                          float f15 = (fI00000oIO2 - f13) - (fI00000oIO4 + f14);
/* 2296 */                          z = z4;
/* 2298 */                          O1IoI1l1IIo0 o1IoI1l1IIo05 = this.I000OiO;
/* 2300 */                          o1IlIoIOOIi = o1IlIoIOOIi2;
/* 2302 */                          O1IlIoIOOIi o1IlIoIOOIi5 = this.I000OOo1O;
/* 2319 */                          float fI00000oIO6 = o1IoI1l1IIo05 == o1IoI1l1IIo02 ? o1IlIoIOOIi5.I00000oOI.I00000oIO("FractionNumDisplayStyleGapMin") : o1IlIoIOOIi5.I00000oOI.I00000oIO("FractionNumeratorGapMin");
/* 2325 */                          if (f15 < fI00000oIO6) {
/* 2328 */                              fI00000oIO2 += fI00000oIO6 - f15;
                                    }
/* 2334 */                          float f16 = (fI00000oIO4 - f14) - (o1O00IIOio1lI00000oOI3.I00000oIO - fI00000oIO3);
/* 2335 */                          O1IoI1l1IIo0 o1IoI1l1IIo06 = this.I000OiO;
/* 2337 */                          O1IlIoIOOIi o1IlIoIOOIi6 = this.I000OOo1O;
/* 2354 */                          float fI00000oIO7 = o1IoI1l1IIo06 == o1IoI1l1IIo02 ? o1IlIoIOOIi6.I00000oOI.I00000oIO("FractionDenomDisplayStyleGapMin") : o1IlIoIOOIi6.I00000oOI.I00000oIO("FractionDenominatorGapMin");
/* 2360 */                          if (f16 < fI00000oIO7) {
/* 2363 */                              fI00000oIO3 += fI00000oIO7 - f16;
                                    }
                                } else {
/* 2365 */                          z = z4;
/* 2367 */                          o1IlIoIOOIi = o1IlIoIOOIi2;
/* 2374 */                          float f17 = (fI00000oIO2 - f13) - (o1O00IIOio1lI00000oOI3.I00000oIO - fI00000oIO3);
/* 2375 */                          O1IoI1l1IIo0 o1IoI1l1IIo07 = this.I000OiO;
/* 2377 */                          O1IlIoIOOIi o1IlIoIOOIi7 = this.I000OOo1O;
/* 2394 */                          float fI00000oIO8 = o1IoI1l1IIo07 == o1IoI1l1IIo02 ? o1IlIoIOOIi7.I00000oOI.I00000oIO("StackDisplayStyleGapMin") : o1IlIoIOOIi7.I00000oOI.I00000oIO("StackGapMin");
/* 2400 */                          if (f17 < fI00000oIO8) {
/* 2403 */                              float f18 = (fI00000oIO8 - f17) / 2.0f;
/* 2405 */                              fI00000oIO2 += f18;
/* 2406 */                              fI00000oIO3 += f18;
                                    }
                                }
/* 2413 */                      O1Illi o1Illi = new O1Illi(o1IllIIlII1.I000II, 23);
/* 2416 */                      o1Illi.I000OOo1O = o1O00IIOio1lI00000oOI2;
/* 2418 */                      o1Illi.I000OiO = o1O00IIOio1lI00000oOI3;
/* 2420 */                      o1Illi.I000II(iIOl10ol0);
/* 2423 */                      o1Illi.I000lI = fI00000oIO2;
/* 2425 */                      o1Illi.I000iOII();
/* 2428 */                      o1Illi.I000o00OoI0I = fI00000oIO3;
/* 2430 */                      o1Illi.I000OiO();
/* 2433 */                      o1Illi.I000l1 = fI00000oIO5;
/* 2435 */                      o1Illi.I000iOII = fI00000oIO4;
/* 2437 */                      String str = o1IllIIlII1.I000l1;
/* 2439 */                      if (str == null) {
                                    O1Illi o1Illi2 = o1Illi;
/* 2443 */                          if (o1IllIIlII1.I000lI != null) {
/* 2447 */                              if (str == null && o1IllIIlII1.I000lI == null) {
/* 2454 */                                  I000II.I000iOII("Failed requirement.");
/* 2457 */                                  return;
                                        }
/* 2461 */                              ArrayList arrayList6 = new ArrayList(0);
/* 2464 */                              O1IoI1l1IIo0 o1IoI1l1IIo08 = this.I000OiO;
/* 2466 */                              O1IlIoIOOIi o1IlIoIOOIi8 = this.I000OOo1O;
/* 2468 */                              if (o1IoI1l1IIo08 == o1IoI1l1IIo02) {
/* 2472 */                                  f2 = 2.39f;
/* 2475 */                                  f3 = o1IlIoIOOIi8.I00000oOI.I00000oIO;
                                        } else {
/* 2481 */                                  f2 = 1.01f;
/* 2484 */                                  f3 = o1IlIoIOOIi8.I00000oOI.I00000oIO;
                                        }
/* 2477 */                              float f19 = f3 * f2;
/* 2487 */                              String str2 = o1IllIIlII1.I000l1;
/* 2489 */                              if (str2 == null || str2.length() <= 0) {
/* 2522 */                                  f4 = 0.0f;
/* 2523 */                                  f5 = 0.0f;
                                        } else {
/* 2497 */                                  O1IlII1o1O0i o1IlII1o1O0iI000II = I000II(str2, f19);
/* 2503 */                                  f4 = 0.0f;
/* 2507 */                                  o1IlII1o1O0iI000II.I000II(new IIOl10ol0(0.0f, 0.0f));
/* 2514 */                                  float fI0000oI002 = o1IlII1o1O0iI000II.I0000oI00() + 0.0f;
/* 2516 */                                  arrayList6.add(o1IlII1o1O0iI000II);
/* 2519 */                                  f5 = fI0000oI002;
                                        }
/* 2529 */                              o1Illi.I000II(new IIOl10ol0(f5, f4));
/* 2536 */                              float fI0000oI003 = o1Illi.I0000oI00() + f5;
/* 2537 */                              arrayList6.add(o1Illi);
/* 2540 */                              String str3 = o1IllIIlII1.I000lI;
/* 2542 */                              if (str3 != null && str3.length() > 0) {
/* 2550 */                                  O1IlII1o1O0i o1IlII1o1O0iI000II2 = I000II(str3, f19);
/* 2559 */                                  o1IlII1o1O0iI000II2.I000II(new IIOl10ol0(fI0000oI003, f4));
/* 2562 */                                  o1IlII1o1O0iI000II2.I0000oI00();
/* 2565 */                                  arrayList6.add(o1IlII1o1O0iI000II2);
                                        }
/* 2572 */                              ?? o1O00IIOio1l3 = new O1O00IIOio1l(arrayList6, o1IllIIlII1.I000II);
/* 2575 */                              o1O00IIOio1l3.I000II(iIOl10ol0);
                                        o1Illi2 = o1O00IIOio1l3;
                                    }
/* 2578 */                          arrayList2.add(o1Illi2);
/* 2588 */                          iIOl10ol0.I00000oIO = o1Illi2.I0000oI00() + iIOl10ol0.I00000oIO;
/* 2592 */                          if (o1IoOOii0Ioi2.I0000O != null || o1IoOOii0Ioi2.I0000Il00O != null) {
/* 2600 */                              int i4 = o1IllIIlII1.I000II.I00000oIO;
/* 2602 */                              z3 = false;
/* 2603 */                              I000lI(o1IoOOii0Ioi2, o1Illi2, 0.0f);
/* 1395 */                              z2 = z3;
/* 3162 */                              o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                              o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                              z4 = z;
/* 3169 */                              fValueOf = f;
/* 3171 */                              it3 = it;
/* 3173 */                              o1IlIoIOOIi2 = o1IlIoIOOIi;
                                    }
/* 673 */                           z2 = false;
/* 3162 */                          o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                          o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                          z4 = z;
/* 3169 */                          fValueOf = f;
/* 3171 */                          it3 = it;
/* 3173 */                          o1IlIoIOOIi2 = o1IlIoIOOIi;
                                }
                                break;
                            case 11:
/* 1929 */                      f = fValueOf;
/* 1931 */                      it = it3;
/* 1940 */                      if (this.I0001Ioi1lo.length() > 0) {
/* 1942 */                          I00000oIO();
                                }
/* 1946 */                      O1O10o1l1 o1O10o1l1 = (O1O10o1l1) o1IoOOii0Ioi2;
/* 1950 */                      I00000oOI(o1IoOOii0Ioi, O1IoiiO0o1.I00iiI);
/* 1957 */                      O1Io10Ol1 o1Io10Ol1I000l1 = I000l1(o1O10o1l1.I000OiO, o1O10o1l1.I000II);
/* 1961 */                      O1IooO o1IooO = o1O10o1l1.I000OOo1O;
/* 1963 */                      if (o1IooO != null) {
/* 1967 */                          O1O00IIOio1l o1O00IIOio1lI00000oIO = l11ioolOl1oO.I00000oIO(o1IooO, o1IlIoIOOIi2, O1IoI1l1IIo0.I00iio);
/* 1973 */                          O1Ill0ioO10 o1Ill0ioO104 = this.I000OOo1O.I00000oOI;
/* 1977 */                          float fI00000oIO9 = o1Ill0ioO104.I00000oIO("RadicalKernBeforeDegree");
/* 1983 */                          float fI00000oIO10 = o1Ill0ioO104.I00000oIO("RadicalKernAfterDegree");
/* 2014 */                          float fIntValue = (o1Io10Ol1I000l1.I00000oIO - o1Io10Ol1I000l1.I00000oOI) * (((Number) ((HashMap) o1Ill0ioO104.I0000oI00.I0000O).get("RadicalDegreeBottomRaisePercent")).intValue() / 100.0f);
/* 2015 */                          o1Io10Ol1I000l1.I000lI = o1O00IIOio1lI00000oIO;
/* 2020 */                          float f20 = o1O00IIOio1lI00000oIO.I0000Il00O + fI00000oIO9 + fI00000oIO10;
/* 2021 */                          o1Io10Ol1I000l1.I000l1 = f20;
/* 2026 */                          if (f20 < 0.0f) {
/* 2028 */                              fI00000oIO9 -= f20;
/* 2029 */                              o1Io10Ol1I000l1.I000l1 = 0.0f;
                                    }
/* 2033 */                          IIOl10ol0 iIOl10ol02 = o1Io10Ol1I000l1.I0001Ioi1lo;
/* 2044 */                          o1O00IIOio1lI00000oIO.I000II(new IIOl10ol0(iIOl10ol02.I00000oIO + fI00000oIO9, iIOl10ol02.I00000oOI + fIntValue));
/* 2061 */                          o1Io10Ol1I000l1.I0000Il00O = o1Io10Ol1I000l1.I000iOII.I0000oI00() + o1Io10Ol1I000l1.I000l1 + o1Io10Ol1I000l1.I000OiO.I0000Il00O;
/* 2063 */                          o1Io10Ol1I000l1.I000iOII();
                                }
/* 2066 */                      arrayList2.add(o1Io10Ol1I000l1);
                                iIOl10ol0.I00000oIO += o1Io10Ol1I000l1.I0000Il00O;
/* 2078 */                      if (o1IoOOii0Ioi2.I0000O != null || o1IoOOii0Ioi2.I0000Il00O != null) {
/* 2086 */                          int i5 = o1O10o1l1.I000II.I00000oIO;
/* 2088 */                          z3 = false;
/* 2089 */                          I000lI(o1IoOOii0Ioi2, o1Io10Ol1I000l1, 0.0f);
/* 1391 */                          z = z4;
/* 1393 */                          o1IlIoIOOIi = o1IlIoIOOIi2;
/* 1395 */                          z2 = z3;
/* 3162 */                          o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                          o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                          z4 = z;
/* 3169 */                          fValueOf = f;
/* 3171 */                          it3 = it;
/* 3173 */                          o1IlIoIOOIi2 = o1IlIoIOOIi;
                                }
/* 669 */                       z = z4;
/* 671 */                       o1IlIoIOOIi = o1IlIoIOOIi2;
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                                break;
                            case 14:
/* 1692 */                      f = fValueOf;
/* 1694 */                      it = it3;
/* 1703 */                      if (this.I0001Ioi1lo.length() > 0) {
/* 1705 */                          I00000oIO();
                                }
/* 1710 */                      I00000oOI(o1IoOOii0Ioi, o1IoOOii0Ioi2.I00000oIO);
/* 1714 */                      O1Io0oIlI o1Io0oIlI = (O1Io0oIlI) o1IoOOii0Ioi2;
/* 1716 */                      O1IoOOii0Ioi o1IoOOii0Ioi3 = o1Io0oIlI.I000OiO;
/* 1718 */                      if (o1IoOOii0Ioi3 == null && o1Io0oIlI.I000iOII == null) {
/* 1725 */                          O1IooO o1IooO2 = o1Io0oIlI.I000OOo1O;
/* 1738 */                          o1O00IIOio1l = o1IooO2 != null ? l11ioolOl1oO.I00000oOI(o1IooO2, o1IlIoIOOIi2, this.I000OiO, z4, false) : null;
                                } else {
/* 1741 */                          if (o1IoOOii0Ioi3 == null && o1Io0oIlI.I000iOII == null) {
/* 1748 */                              I000II.I000iOII("Failed requirement.");
/* 1751 */                              return;
                                    }
/* 1757 */                          O1O00IIOio1l o1O00IIOio1lI00000oOI4 = l11ioolOl1oO.I00000oOI(o1Io0oIlI.I000OOo1O, o1IlIoIOOIi2, this.I000OiO, z4, true);
/* 1765 */                          float fI00000oIO11 = this.I000OOo1O.I00000oOI.I00000oIO("AxisHeight");
/* 1775 */                          float fMax2 = Math.max(o1O00IIOio1lI00000oOI4.I00000oIO - fI00000oIO11, o1O00IIOio1lI00000oOI4.I00000oOI + fI00000oIO11);
/* 1792 */                          float fMax3 = Math.max((fMax2 / 500.0f) * 901.0f, (fMax2 * 2.0f) - 5.0f);
/* 1798 */                          ArrayList arrayList7 = new ArrayList();
/* 1801 */                          O1IoOOii0Ioi o1IoOOii0Ioi4 = o1Io0oIlI.I000OiO;
/* 1803 */                          if (o1IoOOii0Ioi4 == null || o1IoOOii0Ioi4.I00000oOI.length() <= 0) {
/* 1840 */                              f6 = 0.0f;
/* 1841 */                              f7 = 0.0f;
                                    } else {
/* 1815 */                              O1IlII1o1O0i o1IlII1o1O0iI000II3 = I000II(o1IoOOii0Ioi4.I00000oOI, fMax3);
/* 1821 */                              f6 = 0.0f;
/* 1825 */                              o1IlII1o1O0iI000II3.I000II(new IIOl10ol0(0.0f, 0.0f));
/* 1832 */                              float fI0000oI004 = o1IlII1o1O0iI000II3.I0000oI00() + 0.0f;
/* 1834 */                              arrayList7.add(o1IlII1o1O0iI000II3);
/* 1837 */                              f7 = fI0000oI004;
                                    }
/* 1847 */                          o1O00IIOio1lI00000oOI4.I000II(new IIOl10ol0(f7, f6));
/* 1852 */                          float f21 = f7 + o1O00IIOio1lI00000oOI4.I0000Il00O;
/* 1853 */                          arrayList7.add(o1O00IIOio1lI00000oOI4);
/* 1856 */                          O1IoOOii0Ioi o1IoOOii0Ioi5 = o1Io0oIlI.I000iOII;
/* 1858 */                          if (o1IoOOii0Ioi5 != null && o1IoOOii0Ioi5.I00000oOI.length() > 0) {
/* 1870 */                              O1IlII1o1O0i o1IlII1o1O0iI000II4 = I000II(o1IoOOii0Ioi5.I00000oOI, fMax3);
/* 1880 */                              o1IlII1o1O0iI000II4.I000II(new IIOl10ol0(f21, 0.0f));
/* 1883 */                              o1IlII1o1O0iI000II4.I0000oI00();
/* 1886 */                              arrayList7.add(o1IlII1o1O0iI000II4);
                                    }
/* 1893 */                          o1O00IIOio1l = new O1O00IIOio1l(arrayList7, o1Io0oIlI.I000II);
                                }
/* 1896 */                      if (o1O00IIOio1l != null) {
/* 1898 */                          o1O00IIOio1l.I000II(iIOl10ol0);
/* 1906 */                          iIOl10ol0.I00000oIO = o1O00IIOio1l.I0000Il00O + iIOl10ol0.I00000oIO;
/* 1908 */                          arrayList2.add(o1O00IIOio1l);
/* 1913 */                          if (o1IoOOii0Ioi2.I0000O != null || o1IoOOii0Ioi2.I0000Il00O != null) {
/* 1921 */                              int i6 = o1Io0oIlI.I000II.I00000oIO;
/* 1923 */                              z3 = false;
/* 1924 */                              I000lI(o1IoOOii0Ioi2, o1O00IIOio1l, 0.0f);
/* 1391 */                              z = z4;
/* 1393 */                              o1IlIoIOOIi = o1IlIoIOOIi2;
/* 1395 */                              z2 = z3;
/* 3162 */                              o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                              o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                              z4 = z;
/* 3169 */                              fValueOf = f;
/* 3171 */                              it3 = it;
/* 3173 */                              o1IlIoIOOIi2 = o1IlIoIOOIi;
                                    }
                                }
/* 669 */                       z = z4;
/* 671 */                       o1IlIoIOOIi = o1IlIoIOOIi2;
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                                break;
                            case 15:
/* 1546 */                      f = fValueOf;
/* 1548 */                      it = it3;
/* 1557 */                      if (this.I0001Ioi1lo.length() > 0) {
/* 1559 */                          I00000oIO();
                                }
/* 1562 */                      O1IoiiO0o1 o1IoiiO0o13 = O1IoiiO0o1.I00iiI;
/* 1564 */                      I00000oOI(o1IoOOii0Ioi, o1IoiiO0o13);
/* 1567 */                      o1IoOOii0Ioi2.I00000oIO = o1IoiiO0o13;
/* 1570 */                      O1O1I0Ilio0 o1O1I0Ilio0 = (O1O1I0Ilio0) o1IoOOii0Ioi2;
/* 1572 */                      O1IooO o1IooO3 = o1O1I0Ilio0.I000OOo1O;
/* 1574 */                      if (o1IooO3 != null) {
/* 1579 */                          O1O00IIOio1l o1O00IIOio1lI00000oOI5 = l11ioolOl1oO.I00000oOI(o1IooO3, o1IlIoIOOIi2, this.I000OiO, z4, false);
/* 1587 */                          o1Io1iOoiO1 = new O1Io1iOoiO1(o1O00IIOio1lI00000oOI5, o1O1I0Ilio0.I000II);
/* 1604 */                          o1Io1iOoiO1.I000OiO = -(this.I000OOo1O.I00000oOI.I00000oIO("UnderbarVerticalGap") + o1O00IIOio1lI00000oOI5.I00000oOI);
/* 1614 */                          o1Io1iOoiO1.I000iOII = this.I000OOo1O.I00000oOI.I00000oIO("UnderbarRuleThickness");
/* 1618 */                          o1Io1iOoiO1.I00000oIO = o1O00IIOio1lI00000oOI5.I00000oIO;
/* 1651 */                          o1Io1iOoiO1.I00000oOI = this.I000OOo1O.I00000oOI.I00000oIO("UnderbarExtraDescender") + this.I000OOo1O.I00000oOI.I00000oIO("UnderbarRuleThickness") + this.I000OOo1O.I00000oOI.I00000oIO("UnderbarVerticalGap") + o1O00IIOio1lI00000oOI5.I00000oOI;
/* 1655 */                          o1Io1iOoiO1.I0000Il00O = o1O00IIOio1lI00000oOI5.I0000Il00O;
/* 1657 */                          o1Io1iOoiO1.I000II(iIOl10ol0);
                                } else {
/* 1661 */                          o1Io1iOoiO1 = null;
                                }
/* 1662 */                      if (o1Io1iOoiO1 != null) {
/* 1664 */                          arrayList2.add(o1Io1iOoiO1);
                                    iIOl10ol0.I00000oIO += o1Io1iOoiO1.I0000Il00O;
/* 1676 */                          if (o1IoOOii0Ioi2.I0000O != null || o1IoOOii0Ioi2.I0000Il00O != null) {
/* 1684 */                              int i7 = o1O1I0Ilio0.I000II.I00000oIO;
/* 1686 */                              z3 = false;
/* 1687 */                              I000lI(o1IoOOii0Ioi2, o1Io1iOoiO1, 0.0f);
/* 1391 */                              z = z4;
/* 1393 */                              o1IlIoIOOIi = o1IlIoIOOIi2;
/* 1395 */                              z2 = z3;
/* 3162 */                              o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                              o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                              z4 = z;
/* 3169 */                              fValueOf = f;
/* 3171 */                              it3 = it;
/* 3173 */                              o1IlIoIOOIi2 = o1IlIoIOOIi;
                                    }
                                }
/* 669 */                       z = z4;
/* 671 */                       o1IlIoIOOIi = o1IlIoIOOIi2;
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                                break;
                            case 16:
/* 1399 */                      f = fValueOf;
/* 1401 */                      it = it3;
/* 1410 */                      if (this.I0001Ioi1lo.length() > 0) {
/* 1412 */                          I00000oIO();
                                }
/* 1415 */                      O1IoiiO0o1 o1IoiiO0o14 = O1IoiiO0o1.I00iiI;
/* 1417 */                      I00000oOI(o1IoOOii0Ioi, o1IoiiO0o14);
/* 1420 */                      o1IoOOii0Ioi2.I00000oIO = o1IoiiO0o14;
/* 1423 */                      O1O0l01o0 o1O0l01o0 = (O1O0l01o0) o1IoOOii0Ioi2;
/* 1425 */                      O1IooO o1IooO4 = o1O0l01o0.I000OOo1O;
/* 1427 */                      if (o1IooO4 != null) {
/* 1432 */                          O1O00IIOio1l o1O00IIOio1lI00000oOI6 = l11ioolOl1oO.I00000oOI(o1IooO4, o1IlIoIOOIi2, this.I000OiO, z4, false);
/* 1440 */                          o1Io1iOoiO12 = new O1Io1iOoiO1(o1O00IIOio1lI00000oOI6, o1O0l01o0.I000II);
/* 1456 */                          o1Io1iOoiO12.I000OiO = this.I000OOo1O.I00000oOI.I00000oIO("OverbarVerticalGap") + o1O00IIOio1lI00000oOI6.I00000oIO;
/* 1466 */                          o1Io1iOoiO12.I000iOII = this.I000OOo1O.I00000oOI.I00000oIO("UnderbarRuleThickness");
/* 1501 */                          o1Io1iOoiO12.I00000oIO = this.I000OOo1O.I00000oOI.I00000oIO("OverbarExtraAscender") + this.I000OOo1O.I00000oOI.I00000oIO("OverbarRuleThickness") + this.I000OOo1O.I00000oOI.I00000oIO("OverbarVerticalGap") + o1O00IIOio1lI00000oOI6.I00000oIO;
/* 1505 */                          o1Io1iOoiO12.I00000oOI = o1O00IIOio1lI00000oOI6.I00000oOI;
/* 1509 */                          o1Io1iOoiO12.I0000Il00O = o1O00IIOio1lI00000oOI6.I0000Il00O;
/* 1511 */                          o1Io1iOoiO12.I000II(iIOl10ol0);
                                } else {
/* 1515 */                          o1Io1iOoiO12 = null;
                                }
/* 1516 */                      if (o1Io1iOoiO12 != null) {
/* 1518 */                          arrayList2.add(o1Io1iOoiO12);
                                    iIOl10ol0.I00000oIO += o1Io1iOoiO12.I0000Il00O;
/* 1530 */                          if (o1IoOOii0Ioi2.I0000O != null || o1IoOOii0Ioi2.I0000Il00O != null) {
/* 1538 */                              int i8 = o1O0l01o0.I000II.I00000oIO;
/* 1540 */                              z3 = false;
/* 1541 */                              I000lI(o1IoOOii0Ioi2, o1Io1iOoiO12, 0.0f);
/* 1391 */                              z = z4;
/* 1393 */                              o1IlIoIOOIi = o1IlIoIOOIi2;
/* 1395 */                              z2 = z3;
/* 3162 */                              o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                              o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                              z4 = z;
/* 3169 */                              fValueOf = f;
/* 3171 */                              it3 = it;
/* 3173 */                              o1IlIoIOOIi2 = o1IlIoIOOIi;
                                    }
                                }
/* 669 */                       z = z4;
/* 671 */                       o1IlIoIOOIi = o1IlIoIOOIi2;
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                                break;
                            case 17:
/* 920 */                       f = fValueOf;
/* 922 */                       it = it3;
/* 930 */                       if (this.I0001Ioi1lo.length() > 0) {
/* 932 */                           I00000oIO();
                                }
/* 935 */                       O1IoiiO0o1 o1IoiiO0o15 = O1IoiiO0o1.I00iiI;
/* 937 */                       I00000oOI(o1IoOOii0Ioi, o1IoiiO0o15);
/* 940 */                       o1IoOOii0Ioi2.I00000oIO = o1IoiiO0o15;
/* 943 */                       O1Il1I0OOii o1Il1I0OOii = (O1Il1I0OOii) o1IoOOii0Ioi2;
/* 945 */                       O1IooO o1IooO5 = o1Il1I0OOii.I000OOo1O;
/* 947 */                       if (o1IooO5 != null) {
/* 953 */                           o1O00IIOio1lI00000oOI = l11ioolOl1oO.I00000oOI(o1IooO5, o1IlIoIOOIi2, this.I000OiO, true, false);
/* 963 */                           if (o1Il1I0OOii.I00000oOI.length() != 0) {
/* 972 */                               IIOl0O0 iIOl0O0I00000oOI3 = this.I000OOo1O.I00000oOI(o1Il1I0OOii.I00000oOI);
/* 976 */                               float f22 = o1O00IIOio1lI00000oOI.I0000Il00O;
/* 990 */                               List listI00000oOI = O0i1llII.I00000oOI(iIOl0O0I00000oOI3.I00000oIO, (HashMap) this.I000OOo1O.I00000oOI.I0000oI00.I000O01llI0);
/* 997 */                               int size2 = listI00000oOI.size();
/* 1001 */                              if (size2 <= 0) {
/* 1355 */                                  I000II.I000iOII("Failed requirement.");
/* 1358 */                                  return;
                                        }
/* 1003 */                              II1i0i0ilO[] iI1i0i0ilOArr3 = new II1i0i0ilO[size2];
/* 1005 */                              Float[] fArr2 = new Float[size2];
/* 1008 */                              for (int i9 = 0; i9 < size2; i9++) {
/* 1010 */                                  fArr2[i9] = f;
                                        }
/* 1019 */                              this.I000OOo1O.I00000oOI.I0000oI00(listI00000oOI, iI1i0i0ilOArr3, size2);
/* 1026 */                              this.I000OOo1O.I00000oOI.I0000O(listI00000oOI, fArr2, size2);
/* 1034 */                              IIOl0O0 iIOl0O0 = new IIOl0O0(0, 15);
/* 1037 */                              int i10 = 0;
                                        while (true) {
/* 1038 */                                  if (i10 < size2) {
/* 1040 */                                      II1i0i0ilO iI1i0i0ilO2 = iI1i0i0ilOArr3[i10];
/* 1042 */                                      f8 = f22;
/* 1044 */                                      if (iI1i0i0ilO2 != null) {
/* 1048 */                                          i = size2;
/* 1057 */                                          float fMax4 = Math.max(0.0f, Math.max(iI1i0i0ilO2.I0000oI00, iI1i0i0ilO2.I0000Il00O));
/* 1061 */                                          float fI000O01llI02 = I000O01llI0(iI1i0i0ilO2);
/* 1065 */                                          iI1i0i0ilOArr = iI1i0i0ilOArr3;
/* 1077 */                                          if (Math.max(iI1i0i0ilO2.I00000oOI, iI1i0i0ilO2.I0000O) <= f8) {
/* 1104 */                                              iIOl0O0.I00000oIO = ((Number) listI00000oOI.get(i10)).intValue();
/* 1112 */                                              iIOl0O0.I0000O = fArr2[i10].floatValue();
/* 1114 */                                              iIOl0O0.I00000oOI = fMax4;
/* 1116 */                                              iIOl0O0.I0000Il00O = fI000O01llI02;
                                                    } else if (i10 == 0) {
/* 1087 */                                              iIOl0O0.I0000O = fArr2[i10].floatValue();
/* 1089 */                                              iIOl0O0.I00000oOI = fMax4;
/* 1091 */                                              iIOl0O0.I0000Il00O = fI000O01llI02;
                                                    }
                                                } else {
/* 1119 */                                          i = size2;
/* 1121 */                                          iI1i0i0ilOArr = iI1i0i0ilOArr3;
                                                }
/* 1123 */                                      i10++;
/* 1125 */                                      size2 = i;
/* 1127 */                                      iI1i0i0ilOArr3 = iI1i0i0ilOArr;
/* 1129 */                                      f22 = f8;
                                            } else {
/* 1132 */                                      f8 = f22;
                                            }
                                        }
/* 1146 */                              float fMin = Math.min(o1O00IIOio1lI00000oOI.I00000oIO, this.I000OOo1O.I00000oOI.I00000oIO("AccentBaseHeight"));
/* 1156 */                              if (o1Il1I0OOii.I00000oOI.length() == 0) {
/* 1158 */                                  f9 = 0.0f;
                                        } else {
/* 1166 */                                  float fI0001Ioi1lo2 = this.I000OOo1O.I00000oOI.I0001Ioi1lo(iIOl0O0.I00000oIO);
/* 1174 */                                  if (I000iOII(o1Il1I0OOii)) {
/* 1179 */                                      O1IooO o1IooO6 = o1Il1I0OOii.I000OOo1O;
/* 1211 */                                      fI0001Ioi1lo = o1IooO6 != null ? this.I000OOo1O.I00000oOI.I0001Ioi1lo(this.I000OOo1O.I00000oOI(((O1IoOOii0Ioi) o1IooO6.I00000oIO.get(0)).I00000oOI).I00000oIO) : 0.0f;
                                            } else {
/* 1176 */                                      fI0001Ioi1lo = f8 / 2.0f;
                                            }
/* 1212 */                                  f9 = fI0001Ioi1lo - fI0001Ioi1lo2;
                                        }
/* 1219 */                              IIOl10ol0 iIOl10ol03 = new IIOl10ol0(f9, o1O00IIOio1lI00000oOI.I00000oIO - fMin);
/* 1228 */                              O1Il1i0 o1Il1i02 = new O1Il1i0(iIOl0O0, o1Il1I0OOii.I000II, this.I000OOo1O);
/* 1233 */                              o1Il1i02.I00000oIO = iIOl0O0.I00000oOI;
/* 1237 */                              o1Il1i02.I00000oOI = iIOl0O0.I0000Il00O;
/* 1241 */                              o1Il1i02.I0000Il00O = iIOl0O0.I0000O;
/* 1243 */                              o1Il1i02.I000II(iIOl10ol03);
/* 1250 */                              if (I000iOII(o1Il1I0OOii) && (o1Il1I0OOii.I0000O != null || o1Il1I0OOii.I0000Il00O != null)) {
/* 1272 */                                  O1IoOOii0Ioi o1IoOOii0Ioi6 = (O1IoOOii0Ioi) o1Il1I0OOii.I000OOo1O.I00000oIO.get(0);
/* 1276 */                                  o1IoOOii0Ioi6.I000O01llI0(o1Il1I0OOii.I0000Il00O);
/* 1281 */                                  o1IoOOii0Ioi6.I000II(o1Il1I0OOii.I0000O);
/* 1285 */                                  o1Il1I0OOii.I000O01llI0(null);
/* 1288 */                                  o1Il1I0OOii.I000II(null);
/* 1295 */                                  o1O00IIOio1lI00000oOI = l11ioolOl1oO.I00000oOI(o1Il1I0OOii.I000OOo1O, o1IlIoIOOIi2, this.I000OiO, z4, false);
                                        }
/* 1301 */                              OI1IO0IiiI oI1IO0IiiI3 = o1Il1I0OOii.I000II;
/* 1305 */                              ?? o1Il1i03 = new O1Il1i0(oI1IO0IiiI3, 23);
/* 1308 */                              o1Il1i03.I000OiO = o1Il1i02;
/* 1310 */                              o1Il1i03.I000iOII = o1O00IIOio1lI00000oOI;
/* 1317 */                              o1O00IIOio1lI00000oOI.I000II(new IIOl10ol0());
/* 1324 */                              o1Il1i03.I0000O = OI1IO0IiiI.I00000oIO(oI1IO0IiiI3);
/* 1326 */                              VarHandle.storeStoreFence();
/* 1331 */                              o1Il1i03.I0000Il00O = o1O00IIOio1lI00000oOI.I0000Il00O;
/* 1335 */                              o1Il1i03.I00000oOI = o1O00IIOio1lI00000oOI.I00000oOI;
/* 1337 */                              float f23 = o1O00IIOio1lI00000oOI.I00000oIO;
/* 1348 */                              o1Il1i03.I00000oIO = Math.max(f23, (f23 - fMin) + iIOl0O0.I00000oOI);
/* 1350 */                              o1Il1i03.I000II(iIOl10ol0);
/* 1353 */                              o1O00IIOio1lI00000oOI = o1Il1i03;
                                    }
                                } else {
/* 1360 */                          o1O00IIOio1lI00000oOI = null;
                                }
/* 1361 */                      if (o1O00IIOio1lI00000oOI != null) {
/* 1363 */                          arrayList2.add(o1O00IIOio1lI00000oOI);
/* 1373 */                          iIOl10ol0.I00000oIO = o1O00IIOio1lI00000oOI.I0000oI00() + iIOl10ol0.I00000oIO;
/* 1377 */                          if (o1IoOOii0Ioi2.I0000O != null || o1IoOOii0Ioi2.I0000Il00O != null) {
/* 1385 */                              int i11 = o1Il1I0OOii.I000II.I00000oIO;
/* 1387 */                              z3 = false;
/* 1388 */                              I000lI(o1IoOOii0Ioi2, o1O00IIOio1lI00000oOI, 0.0f);
/* 1391 */                              z = z4;
/* 1393 */                              o1IlIoIOOIi = o1IlIoIOOIi2;
/* 1395 */                              z2 = z3;
/* 3162 */                              o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                              o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                              z4 = z;
/* 3169 */                              fValueOf = f;
/* 3171 */                              it3 = it;
/* 3173 */                              o1IlIoIOOIi2 = o1IlIoIOOIi;
                                    }
                                }
/* 669 */                       z = z4;
/* 671 */                       o1IlIoIOOIi = o1IlIoIOOIi2;
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                                break;
                            case PoseLandmark.RIGHT_PINKY:
/* 919 */                       throw new O1Ooo1IIioo("A boundary atom should never be inside a math list.");
                            case PoseLandmark.LEFT_INDEX:
/* 872 */                       f12 = fValueOf;
/* 874 */                       it2 = it3;
/* 882 */                       if (this.I0001Ioi1lo.length() > 0) {
/* 884 */                           I00000oIO();
                                }
/* 903 */                       iIOl10ol0.I00000oIO = ((this.I000OOo1O.I00000oOI.I00000oIO / 18.0f) * ((O1O011o0) o1IoOOii0Ioi2).I000OOo1O) + iIOl10ol0.I00000oIO;
/* 905 */                       fValueOf = f12;
/* 907 */                       it3 = it2;
                            case PoseLandmark.RIGHT_INDEX:
/* 840 */                       f12 = fValueOf;
/* 842 */                       it2 = it3;
/* 850 */                       if (this.I0001Ioi1lo.length() > 0) {
/* 852 */                           I00000oIO();
                                }
/* 857 */                       O1IoI1l1IIo0 o1IoI1l1IIo09 = ((O1O0IiioOiIo) o1IoOOii0Ioi2).I000OOo1O;
/* 859 */                       this.I000OiO = o1IoI1l1IIo09;
/* 869 */                       this.I000OOo1O = o1IlIoIOOIi2.I00000oIO(I000OiO(o1IoI1l1IIo09, o1IlIoIOOIi2));
/* 905 */                       fValueOf = f12;
/* 907 */                       it3 = it2;
                            case PoseLandmark.LEFT_THUMB:
/* 784 */                       f = fValueOf;
/* 786 */                       it = it3;
/* 794 */                       if (this.I0001Ioi1lo.length() > 0) {
/* 796 */                           I00000oIO();
                                }
/* 800 */                       O1Ioll1o o1Ioll1o = (O1Ioll1o) o1IoOOii0Ioi2;
/* 802 */                       O1IooO o1IooO7 = o1Ioll1o.I000OOo1O;
/* 804 */                       if (o1IooO7 != null) {
/* 808 */                           O1O00IIOio1l o1O00IIOio1lI00000oIO2 = l11ioolOl1oO.I00000oIO(o1IooO7, o1IlIoIOOIi2, this.I000OiO);
/* 812 */                           OllO00oiil ollO00oiil = O1Il1olO0o.I00000oIO;
/* 820 */                           o1O00IIOio1lI00000oIO2.I000O01llI0 = O1Il1olO0o.I00000oIO(o1Ioll1o.I000OiO);
/* 822 */                           o1O00IIOio1lI00000oIO2.I00000oIO();
/* 825 */                           o1O00IIOio1lI00000oIO2.I000II(iIOl10ol0);
                                    iIOl10ol0.I00000oIO += o1O00IIOio1lI00000oIO2.I0000Il00O;
/* 835 */                           arrayList2.add(o1O00IIOio1lI00000oIO2);
                                }
/* 669 */                       z = z4;
/* 671 */                       o1IlIoIOOIi = o1IlIoIOOIi2;
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                            case PoseLandmark.RIGHT_THUMB:
/* 677 */                       f = fValueOf;
/* 679 */                       it = it3;
/* 687 */                       if (this.I0001Ioi1lo.length() > 0) {
/* 689 */                           I00000oIO();
                                }
/* 693 */                       O1O0IlIIIiOl o1O0IlIIIiOl = (O1O0IlIIIiOl) o1IoOOii0Ioi2;
/* 695 */                       O1IooO o1IooO8 = o1O0IlIIIiOl.I000OOo1O;
/* 697 */                       if (o1IooO8 != null) {
/* 701 */                           O1O00IIOio1l o1O00IIOio1lI00000oIO3 = l11ioolOl1oO.I00000oIO(o1IooO8, o1IlIoIOOIi2, this.I000OiO);
/* 705 */                           OllO00oiil ollO00oiil2 = O1Il1olO0o.I00000oIO;
/* 713 */                           o1O00IIOio1lI00000oIO3.I000O01llI0 = O1Il1olO0o.I00000oIO(o1O0IlIIIiOl.I000OiO);
/* 715 */                           o1O00IIOio1lI00000oIO3.I00000oIO();
/* 718 */                           if (o1IoOOii0Ioi != null) {
/* 741 */                               float fI000OOo1O2 = I000OOo1O(o1IoOOii0Ioi.I00000oIO, ((O1IoOOii0Ioi) ((O1Il1i0oOooo) o1O00IIOio1lI00000oIO3.I000OOo1O.get(0)).I000iOII.get(0)).I00000oIO);
/* 751 */                               if (this.I0001Ioi1lo.length() <= 0 || fI000OOo1O2 > 0.0f) {
                                            iIOl10ol0.I00000oIO += fI000OOo1O2;
                                        }
                                    }
/* 770 */                           o1O00IIOio1lI00000oIO3.I000II(iIOl10ol0);
                                    iIOl10ol0.I00000oIO += o1O00IIOio1lI00000oIO3.I0000Il00O;
/* 780 */                           arrayList2.add(o1O00IIOio1lI00000oIO3);
                                }
/* 669 */                       z = z4;
/* 671 */                       o1IlIoIOOIi = o1IlIoIOOIi2;
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                                break;
                            case PoseLandmark.LEFT_HIP:
/* 69 */                        if (this.I0001Ioi1lo.length() > 0) {
/* 71 */                            I00000oIO();
                                }
/* 74 */                        O1IoiiO0o1 o1IoiiO0o16 = O1IoiiO0o1.I00o0iI0io1;
/* 76 */                        I00000oOI(o1IoOOii0Ioi, o1IoiiO0o16);
/* 79 */                        o1IoOOii0Ioi2.I00000oIO = o1IoiiO0o16;
/* 82 */                        O1O0Il o1O0Il = (O1O0Il) o1IoOOii0Ioi2;
/* 84 */                        int iI000OiO = o1O0Il.I000OiO();
/* 88 */                        if (iI000OiO == 0 || o1O0Il.I000OiO.size() == 0) {
/* 98 */                            f = fValueOf;
/* 100 */                           it = it3;
/* 655 */                           o1O00IIOio1l2 = new O1O00IIOio1l(new ArrayList(0), o1O0Il.I000II);
                                } else {
/* 104 */                           Float[] fArr3 = new Float[iI000OiO];
/* 107 */                           for (int i12 = 0; i12 < iI000OiO; i12++) {
/* 109 */                               fArr3[i12] = fValueOf;
                                    }
/* 116 */                           int size3 = o1O0Il.I000OiO.size();
/* 120 */                           O1IlII1o1O0i[][] o1IlII1o1O0iArr2 = new O1IlII1o1O0i[size3][];
/* 123 */                           for (int i13 = 0; i13 < size3; i13++) {
/* 127 */                               o1IlII1o1O0iArr2[i13] = new O1IlII1o1O0i[0];
                                    }
/* 134 */                           int size4 = o1O0Il.I000OiO.size();
/* 138 */                           int i14 = 0;
/* 139 */                           while (i14 < size4) {
/* 147 */                               List list2 = (List) o1O0Il.I000OiO.get(i14);
/* 151 */                               List list3 = list2;
/* 153 */                               Float f24 = fValueOf;
/* 155 */                               int size5 = list3.size();
/* 159 */                               Iterator it5 = it3;
/* 161 */                               O1IlII1o1O0i[] o1IlII1o1O0iArr3 = new O1IlII1o1O0i[size5];
/* 165 */                               int i15 = 0;
/* 166 */                               while (i15 < size5) {
/* 172 */                                   int i16 = i15;
/* 182 */                                   o1IlII1o1O0iArr3[i16] = new O1IlII1o1O0i(null, 31);
/* 184 */                                   i15 = i16 + 1;
/* 186 */                                   size5 = size5;
/* 188 */                                   size4 = size4;
                                        }
/* 191 */                               int i17 = size4;
/* 193 */                               o1IlII1o1O0iArr2[i14] = o1IlII1o1O0iArr3;
/* 195 */                               int size6 = list3.size();
/* 199 */                               int i18 = 0;
/* 200 */                               while (i18 < size6) {
/* 208 */                                   int i19 = size6;
/* 212 */                                   int i20 = i18;
/* 215 */                                   O1O00IIOio1l o1O00IIOio1lI00000oOI7 = l11ioolOl1oO.I00000oOI((O1IooO) list2.get(i18), o1IlIoIOOIi2, this.I000OiO, false, false);
/* 235 */                                   fArr3[i20] = Float.valueOf(Math.max(o1O00IIOio1lI00000oOI7.I0000Il00O, fArr3[i20].floatValue()));
/* 237 */                                   o1IlII1o1O0iArr3[i20] = o1O00IIOio1lI00000oOI7;
/* 239 */                                   i18 = i20 + 1;
/* 241 */                                   size6 = i19;
                                        }
/* 244 */                               i14++;
/* 246 */                               fValueOf = f24;
/* 248 */                               it3 = it5;
/* 250 */                               size4 = i17;
                                    }
/* 254 */                           f = fValueOf;
/* 256 */                           it = it3;
/* 261 */                           ArrayList arrayList8 = new ArrayList(0);
/* 264 */                           int i21 = 0;
/* 265 */                           while (i21 < size3) {
/* 267 */                               O1IlII1o1O0i[] o1IlII1o1O0iArr4 = o1IlII1o1O0iArr2[i21];
/* 271 */                               OI1IO0IiiI oI1IO0IiiI4 = new OI1IO0IiiI();
/* 274 */                               int length = o1IlII1o1O0iArr4.length;
/* 275 */                               int i22 = i21;
/* 277 */                               int i23 = 0;
/* 278 */                               float f25 = 0.0f;
/* 280 */                               while (i23 < length) {
/* 282 */                                   O1IlII1o1O0i[] o1IlII1o1O0iArr5 = o1IlII1o1O0iArr4;
/* 284 */                                   O1IlII1o1O0i o1IlII1o1O0i = o1IlII1o1O0iArr5[i23];
/* 288 */                                   float fFloatValue2 = fArr3[i23].floatValue();
/* 292 */                                   int i24 = size3;
/* 313 */                                   int iOrdinal2 = (o1O0Il.I000OOo1O.size() <= i23 ? O1IlI1l.I00iiI : (O1IlI1l) o1O0Il.I000OOo1O.get(i23)).ordinal();
/* 317 */                                   if (iOrdinal2 != 0) {
/* 319 */                                       i2 = i23;
/* 322 */                                       if (iOrdinal2 == 1) {
/* 346 */                                           fI0000oI00 = (fFloatValue2 - o1IlII1o1O0i.I0000oI00()) / 2.0f;
                                                } else {
/* 325 */                                           if (iOrdinal2 != 2) {
/* 336 */                                               I000II.I00000oIO();
/* 339 */                                               return;
                                                    }
/* 331 */                                           fI0000oI00 = fFloatValue2 - o1IlII1o1O0i.I0000oI00();
                                                }
/* 333 */                                       f11 = fI0000oI00 + f25;
                                            } else {
/* 349 */                                       i2 = i23;
/* 351 */                                       f11 = f25;
                                            }
/* 353 */                                   int i25 = oI1IO0IiiI4.I00000oIO;
/* 355 */                                   Float[] fArr4 = fArr3;
/* 358 */                                   if (i25 != -1) {
/* 360 */                                       OI1IO0IiiI oI1IO0IiiI5 = o1IlII1o1O0i.I0000O;
/* 372 */                                       o1IlII1o1O0iArr = o1IlII1o1O0iArr2;
/* 378 */                                       int iMax = Math.max(oI1IO0IiiI5.I00000oIO + oI1IO0IiiI5.I00000oOI, i25 + oI1IO0IiiI4.I00000oOI);
/* 386 */                                       int iMin = Math.min(oI1IO0IiiI5.I00000oIO, oI1IO0IiiI4.I00000oIO);
/* 393 */                                       oI1IO0IiiI4 = new OI1IO0IiiI(iMin, iMax - iMin);
                                            } else {
/* 398 */                                       o1IlII1o1O0iArr = o1IlII1o1O0iArr2;
/* 402 */                                       oI1IO0IiiI4 = OI1IO0IiiI.I00000oIO(o1IlII1o1O0i.I0000O);
                                            }
/* 413 */                                   o1IlII1o1O0i.I000II(new IIOl10ol0(f11, 0.0f));
/* 429 */                                   f25 = ((this.I000OOo1O.I00000oOI.I00000oIO / 18.0f) * o1O0Il.I000l1) + fFloatValue2 + f25;
/* 431 */                                   i23 = i2 + 1;
/* 433 */                                   o1IlII1o1O0iArr4 = o1IlII1o1O0iArr5;
/* 435 */                                   size3 = i24;
/* 437 */                                   fArr3 = fArr4;
/* 439 */                                   o1IlII1o1O0iArr2 = o1IlII1o1O0iArr;
                                        }
/* 460 */                               arrayList8.add(new O1O00IIOio1l(I1IoiO1l.I00IioO0OiOi(o1IlII1o1O0iArr4), oI1IO0IiiI4));
/* 463 */                               i21 = i22 + 1;
                                    }
/* 472 */                           float f26 = o1O0Il.I000lI * 0.3f;
/* 475 */                           float f27 = this.I000OOo1O.I00000oIO;
/* 477 */                           float f28 = f26 * f27;
/* 482 */                           float f29 = (1.2f * f27) + f28;
/* 487 */                           float f30 = (0.1f * f27) + f28;
/* 492 */                           float f31 = (f27 * 0.0f) + f28;
/* 493 */                           Iterator it6 = arrayList8.iterator();
/* 497 */                           float fI0000Il00O = 0.0f;
/* 498 */                           float fI0000O = 0.0f;
/* 499 */                           boolean z9 = true;
/* 500 */                           float fI0000Il00O2 = 0.0f;
/* 506 */                           while (it6.hasNext()) {
/* 512 */                               Iterator it7 = it6;
/* 516 */                               O1IlII1o1O0i o1IlII1o1O0i2 = (O1IlII1o1O0i) it6.next();
/* 518 */                               if (z9) {
/* 525 */                                   o1IlII1o1O0i2.I000II(new IIOl10ol0());
/* 534 */                                   f10 = f31;
/* 532 */                                   fI0000Il00O2 = o1IlII1o1O0i2.I0000Il00O() + fI0000Il00O2;
/* 538 */                                   z9 = false;
                                        } else {
/* 563 */                                   fI0000Il00O -= f29 - (o1IlII1o1O0i2.I0000Il00O() + fI0000O) < f31 ? (o1IlII1o1O0i2.I0000Il00O() + fI0000O) + f30 : f29;
/* 567 */                                   f10 = f31;
/* 573 */                                   o1IlII1o1O0i2.I000II(new IIOl10ol0(0.0f, fI0000Il00O));
                                        }
/* 576 */                               fI0000O = o1IlII1o1O0i2.I0000O();
/* 580 */                               it6 = it7;
/* 582 */                               f31 = f10;
                                    }
/* 599 */                           float fI00000oIO12 = ((fI0000Il00O2 - ((-fI0000Il00O) + fI0000O)) * 0.5f) - this.I000OOo1O.I00000oOI.I00000oIO("AxisHeight");
/* 601 */                           Iterator it8 = arrayList8.iterator();
/* 609 */                           while (it8.hasNext()) {
/* 615 */                               O1IlII1o1O0i o1IlII1o1O0i3 = (O1IlII1o1O0i) it8.next();
/* 619 */                               IIOl10ol0 iIOl10ol04 = o1IlII1o1O0i3.I0001Ioi1lo;
/* 630 */                               o1IlII1o1O0i3.I000II(new IIOl10ol0(iIOl10ol04.I00000oIO, iIOl10ol04.I00000oOI - fI00000oIO12));
                                    }
/* 638 */                           o1O00IIOio1l2 = new O1O00IIOio1l(arrayList8, o1O0Il.I000II);
/* 641 */                           o1O00IIOio1l2.I000II(iIOl10ol0);
                                }
/* 659 */                       arrayList2.add(o1O00IIOio1l2);
                                iIOl10ol0.I00000oIO += o1O00IIOio1l2.I0000Il00O;
/* 669 */                       z = z4;
/* 671 */                       o1IlIoIOOIi = o1IlIoIOOIi2;
/* 673 */                       z2 = false;
/* 3162 */                      o1IoiiO0o1 = o1IoOOii0Ioi2.I00000oIO;
/* 3164 */                      o1IoOOii0Ioi = o1IoOOii0Ioi2;
/* 3167 */                      z4 = z;
/* 3169 */                      fValueOf = f;
/* 3171 */                      it3 = it;
/* 3173 */                      o1IlIoIOOIi2 = o1IlIoIOOIi;
                                break;
                            default:
/* 59 */                        I000II.I00000oIO();
/* 62 */                        return;
                        }
                    }
/* 3183 */          if (this.I0001Ioi1lo.length() > 0) {
/* 3185 */              I00000oIO();
                    }
/* 3190 */          if (!this.I0000Il00O || o1IoiiO0o1 == O1IoiiO0o1.I00iOIl) {
/* 3216 */              return;
                    }
/* 3200 */          O1IlII1o1O0i o1IlII1o1O0i4 = (O1IlII1o1O0i) IOOi0Ool1i.I00Io1o110i(arrayList2);
/* 3213 */          o1IlII1o1O0i4.I000OOo1O(o1IlII1o1O0i4.I0000oI00() + I000OOo1O(o1IoiiO0o1, O1IoiiO0o1.I00l0OO0IO));
                }

                public final IIOl0O0 I0001Ioi1lo(IIOl0O0 iIOl0O0, float f) {
/* 13 */            List listI00000oOI = O0i1llII.I00000oOI(iIOl0O0.I00000oIO, (HashMap) this.I000OOo1O.I00000oOI.I0000oI00.I000II);
/* 20 */            int size = listI00000oOI.size();
/* 24 */            II1i0i0ilO[] iI1i0i0ilOArr = new II1i0i0ilO[size];
/* 26 */            Float[] fArr = new Float[size];
/* 28 */            int i = 0;
/* 31 */            for (int i2 = 0; i2 < size; i2++) {
/* 37 */                fArr[i2] = Float.valueOf(0.0f);
                    }
/* 46 */            this.I000OOo1O.I00000oOI.I0000oI00(listI00000oOI, iI1i0i0ilOArr, size);
/* 53 */            this.I000OOo1O.I00000oOI.I0000O(listI00000oOI, fArr, size);
/* 56 */            float f2 = 0.0f;
/* 57 */            float f3 = 0.0f;
/* 58 */            float fFloatValue = 0.0f;
/* 59 */            while (i < size) {
/* 61 */                II1i0i0ilO iI1i0i0ilO = iI1i0i0ilOArr[i];
/* 65 */                fFloatValue = fArr[i].floatValue();
/* 81 */                float fMax = iI1i0i0ilO == null ? 0.0f : Math.max(0.0f, Math.max(iI1i0i0ilO.I0000oI00, iI1i0i0ilO.I0000Il00O));
/* 85 */                float fI000O01llI0 = I000O01llI0(iI1i0i0ilO);
/* 93 */                if (fMax + fI000O01llI0 >= f) {
/* 107 */                   return new IIOl0O0(fMax, fI000O01llI0, fFloatValue, ((Number) listI00000oOI.get(i)).intValue());
                        }
/* 111 */               i++;
/* 113 */               float f4 = fMax;
/* 114 */               f3 = fI000O01llI0;
/* 115 */               f2 = f4;
                    }
/* 131 */           return new IIOl0O0(f2, f3, fFloatValue, ((Number) listI00000oOI.get(size - 1)).intValue());
                }

                public final O1IlII1o1O0i I000II(String str, float f) {
/* 3 */             IIOl0O0 iIOl0O0I00000oOI = this.I000OOo1O.I00000oOI(str);
/* 7 */             IIOl0O0 iIOl0O0I0001Ioi1lo = I0001Ioi1lo(iIOl0O0I00000oOI, f);
/* 25 */            O1IlII1o1O0i o1IlII1o1O0iI0000O = iIOl0O0I0001Ioi1lo.I00000oOI + iIOl0O0I0001Ioi1lo.I0000Il00O < f ? I0000O(iIOl0O0I00000oOI, f) : null;
/* 26 */            if (o1IlII1o1O0iI0000O == null) {
/* 39 */                o1IlII1o1O0iI0000O = new O1Il1i0(iIOl0O0I0001Ioi1lo, new OI1IO0IiiI(-1, 0), this.I000OOo1O);
/* 44 */                o1IlII1o1O0iI0000O.I00000oIO = iIOl0O0I0001Ioi1lo.I00000oOI;
/* 48 */                o1IlII1o1O0iI0000O.I00000oOI = iIOl0O0I0001Ioi1lo.I0000Il00O;
/* 52 */                o1IlII1o1O0iI0000O.I0000Il00O = iIOl0O0I0001Ioi1lo.I0000O;
                    }
/* 77 */            o1IlII1o1O0iI0000O.I0000oI00 = ((o1IlII1o1O0iI0000O.I0000Il00O() - o1IlII1o1O0iI0000O.I0000O()) * 0.5f) - this.I000OOo1O.I00000oOI.I00000oIO("AxisHeight");
/* 89 */            return o1IlII1o1O0iI0000O;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r0
                  0x0033: PHI (r0v5 int) = (r0v4 int), (r0v6 int) binds: [B:20:0x0041, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final float I000OOo1O(O1IoiiO0o1 o1IoiiO0o1, O1IoiiO0o1 o1IoiiO0o12) throws O1Ooo1IIioo {
/* 6 */             int i = 0;
/* 15 */            O1Io0oOooO o1Io0oOooO = O1O11l00i1IO.I00000oIO[O1O11l00i1IO.I00000oIO(o1IoiiO0o1, true)][O1O11l00i1IO.I00000oIO(o1IoiiO0o12, false)];
/* 19 */            if (o1Io0oOooO == O1Io0oOooO.I00iOIl) {
/* 551 */               throw new O1Ooo1IIioo("Invalid space between " + o1IoiiO0o1 + " and " + o1IoiiO0o12);
                    }
/* 21 */            int iOrdinal = o1Io0oOooO.ordinal();
/* 26 */            if (iOrdinal == 0) {
/* 81 */                i = -1;
                    } else if (iOrdinal != 1) {
/* 32 */                if (iOrdinal == 2) {
/* 79 */                    i = 3;
                        } else if (iOrdinal != 3) {
/* 36 */                    int i2 = 4;
/* 37 */                    if (iOrdinal != 4) {
/* 39 */                        i2 = 5;
/* 40 */                        if (iOrdinal != 5) {
/* 54 */                            I000II.I00000oIO();
/* 25 */                            return 0.0f;
                                }
/* 50 */                        if (this.I000OiO.compareTo(O1IoI1l1IIo0.I00iiO) < 0) {
/* 52 */                            i = i2;
                                }
                            } else if (this.I000OiO.compareTo(O1IoI1l1IIo0.I00iiO) < 0) {
                            }
                        } else if (this.I000OiO.compareTo(O1IoI1l1IIo0.I00iiO) < 0) {
                        }
                    }
/* 82 */            if (i <= 0) {
/* 25 */                return 0.0f;
                    }
/* 94 */            return (this.I000OOo1O.I00000oOI.I00000oIO / 18.0f) * i;
                }

                public final O1Io10Ol1 I000l1(O1IooO o1IooO, OI1IO0IiiI oI1IO0IiiI) throws O1Ooo1IIioo {
/* 7 */             O1O00IIOio1l o1O00IIOio1lI00000oOI = l11ioolOl1oO.I00000oOI(o1IooO, this.I00000oIO, this.I000OiO, true, false);
/* 11 */            O1IoI1l1IIo0 o1IoI1l1IIo0 = this.I000OiO;
/* 13 */            O1IoI1l1IIo0 o1IoI1l1IIo02 = O1IoI1l1IIo0.I00iOIl;
/* 15 */            O1IlIoIOOIi o1IlIoIOOIi = this.I000OOo1O;
/* 32 */            float fI00000oIO = o1IoI1l1IIo0 == o1IoI1l1IIo02 ? o1IlIoIOOIi.I00000oOI.I00000oIO("RadicalDisplayStyleVerticalGap") : o1IlIoIOOIi.I00000oOI.I00000oIO("RadicalVerticalGap");
/* 42 */            float fI00000oIO2 = this.I000OOo1O.I00000oOI.I00000oIO("RadicalRuleThickness");
/* 52 */            float f = o1O00IIOio1lI00000oOI.I00000oIO + o1O00IIOio1lI00000oOI.I00000oOI + fI00000oIO + fI00000oIO2;
/* 57 */            IIOl0O0 iIOl0O0I00000oOI = this.I000OOo1O.I00000oOI("√");
/* 61 */            IIOl0O0 iIOl0O0I0001Ioi1lo = I0001Ioi1lo(iIOl0O0I00000oOI, f);
/* 79 */            O1IlII1o1O0i o1IlII1o1O0iI0000O = iIOl0O0I0001Ioi1lo.I00000oOI + iIOl0O0I0001Ioi1lo.I0000Il00O < f ? I0000O(iIOl0O0I00000oOI, f) : null;
/* 80 */            if (o1IlII1o1O0iI0000O == null) {
/* 92 */                o1IlII1o1O0iI0000O = new O1Il1i0(iIOl0O0I0001Ioi1lo, new OI1IO0IiiI(-1, 0), this.I000OOo1O);
/* 97 */                o1IlII1o1O0iI0000O.I00000oIO = iIOl0O0I0001Ioi1lo.I00000oOI;
/* 101 */               o1IlII1o1O0iI0000O.I00000oOI = iIOl0O0I0001Ioi1lo.I0000Il00O;
/* 105 */               o1IlII1o1O0iI0000O.I0000Il00O = iIOl0O0I0001Ioi1lo.I0000O;
                    }
/* 115 */           float fI0000Il00O = o1IlII1o1O0iI0000O.I0000Il00O() + o1IlII1o1O0iI0000O.I0000O();
/* 116 */           float f2 = o1O00IIOio1lI00000oOI.I00000oIO;
/* 123 */           float f3 = fI0000Il00O - (((o1O00IIOio1lI00000oOI.I00000oOI + f2) + fI00000oIO) + fI00000oIO2);
/* 127 */           if (f3 > 0.0f) {
/* 132 */               fI00000oIO += f3 / 2.0f;
                    }
/* 134 */           float f4 = fI00000oIO + fI00000oIO2 + f2;
/* 142 */           o1IlII1o1O0iI0000O.I0000oI00 = -(f4 - o1IlII1o1O0iI0000O.I0000Il00O());
/* 148 */           O1Io10Ol1 o1Io10Ol1 = new O1Io10Ol1(oI1IO0IiiI, 23, 1);
/* 151 */           o1Io10Ol1.I000OiO = o1O00IIOio1lI00000oOI;
/* 153 */           o1Io10Ol1.I000iOII = o1IlII1o1O0iI0000O;
/* 155 */           o1Io10Ol1.I000iOII();
/* 158 */           VarHandle.storeStoreFence();
/* 163 */           o1Io10Ol1.I000II(this.I0000oI00);
/* 177 */           o1Io10Ol1.I00000oIO = this.I000OOo1O.I00000oOI.I00000oIO("RadicalExtraAscender") + f4;
/* 187 */           o1Io10Ol1.I000o00OoI0I = this.I000OOo1O.I00000oOI.I00000oIO("RadicalExtraAscender");
/* 189 */           o1Io10Ol1.I000oI1ioi = fI00000oIO2;
/* 207 */           o1Io10Ol1.I00000oOI = Math.max((o1IlII1o1O0iI0000O.I0000O() + o1IlII1o1O0iI0000O.I0000Il00O()) - f4, o1O00IIOio1lI00000oOI.I00000oOI);
/* 216 */           o1Io10Ol1.I0000Il00O = o1IlII1o1O0iI0000O.I0000oI00() + o1O00IIOio1lI00000oOI.I0000Il00O;
/* 551 */           return o1Io10Ol1;
                }

                public final void I000lI(O1IoOOii0Ioi o1IoOOii0Ioi, O1IlII1o1O0i o1IlII1o1O0i, float f) throws O1Ooo1IIioo {
/* 1 */             boolean z = this.I00000oOI;
/* 3 */             ArrayList arrayList = this.I0000O;
/* 5 */             O1IlIoIOOIi o1IlIoIOOIi = this.I00000oIO;
/* 7 */             IIOl10ol0 iIOl10ol0 = this.I0000oI00;
/* 9 */             O1IooO o1IooO = o1IoOOii0Ioi.I0000O;
/* 11 */            O1IooO o1IooO2 = o1IoOOii0Ioi.I0000Il00O;
/* 13 */            if (o1IooO == null && o1IooO2 == null) {
/* 20 */                I000II.I000iOII("Failed requirement.");
/* 23 */                return;
                    }
/* 36 */            O1Ill0ioO10 o1Ill0ioO10 = o1IlIoIOOIi.I00000oIO(I000OiO(I000o00OoI0I(), o1IlIoIOOIi)).I00000oOI;
/* 48 */            float fI0000Il00O = o1IlII1o1O0i.I0000Il00O() - o1Ill0ioO10.I00000oIO("SuperscriptBaselineDropMax");
/* 59 */            float fI00000oIO = o1Ill0ioO10.I00000oIO("SubscriptBaselineDropMin") + o1IlII1o1O0i.I0000O();
/* 66 */            if (o1IooO2 == null && o1IooO != null) {
/* 74 */                O1O00IIOio1l o1O00IIOio1lI00000oOI = l11ioolOl1oO.I00000oOI(o1IooO, o1IlIoIOOIi, I000o00OoI0I(), true, false);
/* 78 */                O1IoI0O110OO[] o1IoI0O110OOArr = O1IoI0O110OO.I00iOIl;
/* 119 */               o1O00IIOio1lI00000oOI.I000II(new IIOl10ol0(iIOl10ol0.I00000oIO, iIOl10ol0.I00000oOI - Math.max(Math.max(fI00000oIO, this.I000OOo1O.I00000oOI.I00000oIO("SubscriptShiftDown")), o1O00IIOio1lI00000oOI.I00000oIO - this.I000OOo1O.I00000oOI.I00000oIO("SubscriptTopMax"))));
/* 122 */               arrayList.add(o1O00IIOio1lI00000oOI);
/* 139 */               iIOl10ol0.I00000oIO = this.I000OOo1O.I00000oOI.I00000oIO("SpaceAfterScript") + o1O00IIOio1lI00000oOI.I0000Il00O + iIOl10ol0.I00000oIO;
/* 141 */               return;
                    }
/* 146 */           O1O00IIOio1l o1O00IIOio1lI00000oOI2 = l11ioolOl1oO.I00000oOI(o1IooO2, o1IlIoIOOIi, I000o00OoI0I(), z, false);
/* 150 */           O1IoI0O110OO[] o1IoI0O110OOArr2 = O1IoI0O110OO.I00iOIl;
/* 152 */           O1IlIoIOOIi o1IlIoIOOIi2 = this.I000OOo1O;
/* 190 */           float fMax = Math.max(Math.max(fI0000Il00O, z ? o1IlIoIOOIi2.I00000oOI.I00000oIO("SuperscriptShiftUpCramped") : o1IlIoIOOIi2.I00000oOI.I00000oIO("SuperscriptShiftUp")), this.I000OOo1O.I00000oOI.I00000oIO("SuperscriptBottomMin") + o1O00IIOio1lI00000oOI2.I00000oOI);
/* 194 */           if (o1IooO == null) {
/* 206 */               o1O00IIOio1lI00000oOI2.I000II(new IIOl10ol0(iIOl10ol0.I00000oIO, iIOl10ol0.I00000oOI + fMax));
/* 209 */               arrayList.add(o1O00IIOio1lI00000oOI2);
/* 226 */               iIOl10ol0.I00000oIO = this.I000OOo1O.I00000oOI.I00000oIO("SpaceAfterScript") + o1O00IIOio1lI00000oOI2.I0000Il00O + iIOl10ol0.I00000oIO;
/* 228 */               return;
                    }
/* 233 */           O1O00IIOio1l o1O00IIOio1lI00000oOI3 = l11ioolOl1oO.I00000oOI(o1IooO, o1IlIoIOOIi, I000o00OoI0I(), true, false);
/* 245 */           float fMax2 = Math.max(fI00000oIO, this.I000OOo1O.I00000oOI.I00000oIO("SubscriptShiftDown"));
/* 257 */           float f2 = (fMax2 - o1O00IIOio1lI00000oOI3.I00000oIO) + (fMax - o1O00IIOio1lI00000oOI2.I00000oOI);
/* 270 */           if (f2 < this.I000OOo1O.I00000oOI.I00000oIO("SubSuperscriptGapMin")) {
/* 281 */               fMax2 += this.I000OOo1O.I00000oOI.I00000oIO("SubSuperscriptGapMin") - f2;
/* 296 */               float fI00000oIO2 = this.I000OOo1O.I00000oOI.I00000oIO("SuperscriptBottomMaxWithSubscript") - (fMax - o1O00IIOio1lI00000oOI2.I00000oOI);
/* 300 */               if (fI00000oIO2 > 0.0f) {
/* 302 */                   fMax += fI00000oIO2;
/* 303 */                   fMax2 -= fI00000oIO2;
                        }
                    }
/* 315 */           o1O00IIOio1lI00000oOI2.I000II(new IIOl10ol0(iIOl10ol0.I00000oIO + f, iIOl10ol0.I00000oOI + fMax));
/* 318 */           arrayList.add(o1O00IIOio1lI00000oOI2);
/* 331 */           o1O00IIOio1lI00000oOI3.I000II(new IIOl10ol0(iIOl10ol0.I00000oIO, iIOl10ol0.I00000oOI - fMax2));
/* 334 */           arrayList.add(o1O00IIOio1lI00000oOI3);
/* 358 */           iIOl10ol0.I00000oIO = this.I000OOo1O.I00000oOI.I00000oIO("SpaceAfterScript") + Math.max(o1O00IIOio1lI00000oOI2.I0000Il00O + f, o1O00IIOio1lI00000oOI3.I0000Il00O) + iIOl10ol0.I00000oIO;
                }

                public final O1IoI1l1IIo0 I000o00OoI0I() {
/* 3 */             int iOrdinal = this.I000OiO.ordinal();
/* 7 */             if (iOrdinal == 0 || iOrdinal == 1) {
/* 29 */                return O1IoI1l1IIo0.I00iiO;
                    }
/* 13 */            if (iOrdinal == 2) {
/* 26 */                return O1IoI1l1IIo0.I00iio;
                    }
/* 16 */            if (iOrdinal == 3) {
/* 18 */                return O1IoI1l1IIo0.I00iio;
                    }
/* 21 */            I000II.I00000oIO();
/* 24 */            return null;
                }
            }
