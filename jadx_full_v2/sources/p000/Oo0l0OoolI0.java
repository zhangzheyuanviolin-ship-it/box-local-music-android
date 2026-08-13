            package p000;

            import android.util.Log;
            import java.text.Normalizer;
            import java.util.Arrays;
            import java.util.HashMap;
            
            public final class Oo0l0OoolI0 {
                public static final HashMap I0010I0i;
                public O1OoooIi1Ol0 I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public int I0000oI00;
                public float I0001Ioi1lo;
                public float I000II;
                public float I000O01llI0;
                public float I000OOo1O;
                public float I000OiO;
                public int[] I000iOII;
                public OIll100 I000l1;
                public float I000lI;
                public int I000o00OoI0I;
                public float[] I000oI1ioi;
                public String I00100l0;
                public float I00100o1O0lo;

                static {
/* 5 */             HashMap map = new HashMap(31);
/* 16 */            map.put(96, "̀");
/* 25 */            map.put(715, "̀");
/* 36 */            map.put(39, "́");
/* 45 */            map.put(697, "́");
/* 54 */            map.put(714, "́");
/* 65 */            map.put(94, "̂");
/* 74 */            map.put(710, "̂");
/* 85 */            map.put(126, "̃");
/* 96 */            map.put(713, "̄");
/* 107 */           map.put(176, "̊");
/* 118 */           map.put(698, "̋");
/* 129 */           map.put(711, "̌");
/* 140 */           map.put(712, "̍");
/* 151 */           map.put(34, "̎");
/* 162 */           map.put(699, "̒");
/* 173 */           map.put(700, "̓");
/* 182 */           map.put(1158, "̓");
/* 191 */           map.put(1370, "̓");
/* 202 */           map.put(701, "̔");
/* 211 */           map.put(1157, "̔");
/* 220 */           map.put(1369, "̔");
/* 231 */           map.put(724, "̝");
/* 242 */           map.put(725, "̞");
/* 253 */           map.put(726, "̟");
/* 264 */           map.put(727, "̠");
/* 275 */           map.put(690, "̡");
/* 286 */           map.put(716, "̩");
/* 297 */           map.put(695, "̫");
/* 308 */           map.put(717, "̱");
/* 319 */           map.put(95, "̲");
/* 330 */           map.put(8270, "͙");
/* 333 */           I0010I0i = map;
                }

                public final boolean I00000oIO(Oo0l0OoolI0 oo0l0OoolI0) {
/* 5 */             double dI0000O = I0000O();
/* 14 */            double dI0000Il00O = I0000Il00O(I00000oOI());
/* 19 */            double d = dI0000O + dI0000Il00O;
/* 21 */            double dI0000O2 = oo0l0OoolI0.I0000O();
/* 35 */            double dI0000Il00O2 = oo0l0OoolI0.I0000Il00O(oo0l0OoolI0.I00000oOI()) + dI0000O2;
/* 38 */            if (dI0000Il00O2 <= dI0000O || dI0000O2 >= d) {
/* 111 */               return false;
                    }
/* 45 */            double dI0001Ioi1lo = I0001Ioi1lo();
/* 50 */            double dI0001Ioi1lo2 = oo0l0OoolI0.I0001Ioi1lo();
/* 63 */            if (oo0l0OoolI0.I0000O + dI0001Ioi1lo2 < dI0001Ioi1lo || dI0001Ioi1lo2 > dI0001Ioi1lo + this.I0000O) {
/* 111 */               return false;
                    }
                    return (dI0000O2 <= dI0000O || dI0000Il00O2 <= d) ? dI0000O2 >= dI0000O || dI0000Il00O2 >= d || (dI0000Il00O2 - dI0000O) / dI0000Il00O > 0.15d : (d - dI0000O2) / dI0000Il00O > 0.15d;
                }

                public final float I00000oOI() {
/* 1 */             float f = this.I00100o1O0lo;
/* 6 */             if (f >= 0.0f) {
/* 541 */               return f;
                    }
/* 10 */            float[] fArr = this.I00000oIO.I00iOIl;
/* 13 */            float f2 = fArr[4];
/* 16 */            float f3 = fArr[1];
/* 19 */            float f4 = fArr[3];
/* 22 */            float f5 = fArr[0];
/* 26 */            if (f2 > 0.0f && Math.abs(f3) < f5 && Math.abs(f4) < f2 && f5 > 0.0f) {
/* 48 */                this.I00100o1O0lo = 0.0f;
/* 3 */                 return 0.0f;
                    }
/* 53 */            if (f2 < 0.0f && Math.abs(f3) < Math.abs(f5) && Math.abs(f4) < Math.abs(f2) && f5 < 0.0f) {
/* 85 */                this.I00100o1O0lo = 180.0f;
/* 83 */                return 180.0f;
                    }
/* 98 */            if (Math.abs(f2) < Math.abs(f4) && f3 > 0.0f && f4 < 0.0f && Math.abs(f5) < f3) {
/* 118 */               this.I00100o1O0lo = 90.0f;
/* 116 */               return 90.0f;
                    }
/* 127 */           if (Math.abs(f2) >= f4 || f3 >= 0.0f || f4 <= 0.0f || Math.abs(f5) >= Math.abs(f3)) {
/* 154 */               this.I00100o1O0lo = 0.0f;
/* 3 */                 return 0.0f;
                    }
/* 151 */           this.I00100o1O0lo = 270.0f;
/* 149 */           return 270.0f;
                }

                public final float I0000Il00O(float f) {
/* 1 */             O1OoooIi1Ol0 o1OoooIi1Ol0 = this.I00000oIO;
                    return (f == 90.0f || f == 270.0f) ? Math.abs(this.I0000Il00O - o1OoooIi1Ol0.I000II()) : Math.abs(this.I00000oOI - o1OoooIi1Ol0.I0001Ioi1lo());
                }

                public final float I0000O() {
/* 5 */             return I0000oI00(I00000oOI());
                }

                public final float I0000oI00(float f) {
                    float f2;
                    float fI000II;
/* 1 */             O1OoooIi1Ol0 o1OoooIi1Ol0 = this.I00000oIO;
/* 6 */             if (f == 0.0f) {
/* 8 */                 return o1OoooIi1Ol0.I0001Ioi1lo();
                    }
/* 17 */            if (f == 90.0f) {
/* 19 */                return o1OoooIi1Ol0.I000II();
                    }
/* 28 */            if (f == 180.0f) {
/* 30 */                f2 = this.I000OOo1O;
/* 32 */                fI000II = o1OoooIi1Ol0.I0001Ioi1lo();
                    } else {
/* 42 */                if (f != 270.0f) {
/* 3 */                     return 0.0f;
                        }
/* 44 */                f2 = this.I000O01llI0;
/* 46 */                fI000II = o1OoooIi1Ol0.I000II();
                    }
/* 36 */            return f2 - fI000II;
                }

                public final float I0001Ioi1lo() {
                    float f;
                    float fI000II;
/* 1 */             float fI00000oOI = I00000oOI();
/* 8 */             if (fI00000oOI == 0.0f || fI00000oOI == 180.0f) {
/* 25 */                f = this.I000O01llI0;
/* 27 */                fI000II = I000II(fI00000oOI);
                    } else {
/* 17 */                f = this.I000OOo1O;
/* 19 */                fI000II = I000II(fI00000oOI);
                    }
/* 23 */            return f - fI000II;
                }

                public final float I000II(float f) {
                    float f2;
                    float fI000II;
/* 1 */             O1OoooIi1Ol0 o1OoooIi1Ol0 = this.I00000oIO;
/* 6 */             if (f == 0.0f) {
/* 8 */                 return o1OoooIi1Ol0.I000II();
                    }
/* 17 */            if (f == 90.0f) {
/* 19 */                f2 = this.I000OOo1O;
/* 21 */                fI000II = o1OoooIi1Ol0.I0001Ioi1lo();
                    } else {
/* 31 */                if (f != 180.0f) {
/* 44 */                    if (f == 270.0f) {
/* 46 */                        return o1OoooIi1Ol0.I0001Ioi1lo();
                            }
/* 3 */                     return 0.0f;
                        }
/* 33 */                f2 = this.I000O01llI0;
/* 35 */                fI000II = o1OoooIi1Ol0.I000II();
                    }
/* 25 */            return f2 - fI000II;
                }

                public final void I000O01llI0(int i, Oo0l0OoolI0 oo0l0OoolI0) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 9 */             sb.append((CharSequence) this.I00100l0, 0, i);
/* 12 */            float[] fArr = this.I000oI1ioi;
/* 17 */            float[] fArr2 = new float[fArr.length + 1];
/* 19 */            System.arraycopy(fArr, 0, fArr2, 0, i);
/* 28 */            sb.append(this.I00100l0.charAt(i));
/* 35 */            fArr2[i] = this.I000oI1ioi[i];
/* 37 */            String str = oo0l0OoolI0.I00100l0;
/* 39 */            int iCodePointAt = str.codePointAt(0);
/* 43 */            Integer numValueOf = Integer.valueOf(iCodePointAt);
/* 47 */            HashMap map = I0010I0i;
/* 76 */            sb.append(map.containsKey(numValueOf) ? (String) map.get(Integer.valueOf(iCodePointAt)) : Normalizer.normalize(str, Normalizer.Form.NFKC).trim());
/* 79 */            int i2 = i + 1;
/* 82 */            fArr2[i2] = 0.0f;
/* 90 */            sb.append(this.I00100l0.substring(i2));
/* 101 */           System.arraycopy(this.I000oI1ioi, i2, fArr2, i + 2, (r1.length - i) - 1);
/* 108 */           this.I00100l0 = sb.toString();
/* 110 */           this.I000oI1ioi = fArr2;
                }

                public final boolean I000OOo1O() {
/* 1 */             String str = this.I00100l0;
/* 9 */             if (str.length() != 1 || "ー".equals(str)) {
/* 7 */                 return false;
                    }
/* 25 */            int type = Character.getType(str.charAt(0));
                    return type == 6 || type == 27 || type == 4;
                }

                public final void I000OiO(Oo0l0OoolI0 oo0l0OoolI0) {
/* 8 */             if (oo0l0OoolI0.I00100l0.length() > 1) {
/* 186 */               return;
                    }
/* 12 */            float fI0000O = oo0l0OoolI0.I0000O();
/* 18 */            int i = 0;
/* 21 */            float f = oo0l0OoolI0.I000oI1ioi[0] + fI0000O;
/* 22 */            float fI0000O2 = I0000O();
/* 28 */            int length = this.I00100l0.length();
/* 32 */            float f2 = fI0000O2;
/* 33 */            boolean z = false;
/* 34 */            while (i < length && !z) {
/* 38 */                float[] fArr = this.I000oI1ioi;
/* 41 */                if (i >= fArr.length) {
/* 76 */                    Log.i("PdfBox-Android", "diacritic " + oo0l0OoolI0.I00100l0 + " on ligature " + this.I00100l0 + " is not supported yet and is ignored (PDFBOX-2831)");
/* 79 */                    return;
                        }
/* 80 */                float f3 = fArr[i];
/* 82 */                float f4 = f2 + f3;
/* 86 */                if (fI0000O >= f2 || f > f4) {
/* 121 */                   if (fI0000O >= f2 && f > f4 && i != length - 1) {
/* 147 */                       f2 += this.I000oI1ioi[i];
/* 148 */                       i++;
                            } else {
/* 139 */                       I000O01llI0(i, oo0l0OoolI0);
                            }
                        } else if (i == 0) {
/* 94 */                    I000O01llI0(i, oo0l0OoolI0);
                        } else {
                            int i2 = i - 1;
/* 110 */                   if ((f - f2) / f3 >= (f2 - fI0000O) / fArr[i2]) {
/* 112 */                       I000O01llI0(i, oo0l0OoolI0);
                            } else {
/* 116 */                       I000O01llI0(i2, oo0l0OoolI0);
                            }
                        }
/* 119 */               z = true;
/* 147 */               f2 += this.I000oI1ioi[i];
/* 148 */               i++;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 166 */               return true;
                    }
/* 7 */             if (!(obj instanceof Oo0l0OoolI0)) {
/* 168 */               return false;
                    }
/* 11 */            Oo0l0OoolI0 oo0l0OoolI0 = (Oo0l0OoolI0) obj;
/* 21 */            if (Float.compare(oo0l0OoolI0.I00000oOI, this.I00000oOI) != 0 || Float.compare(oo0l0OoolI0.I0000Il00O, this.I0000Il00O) != 0 || Float.compare(oo0l0OoolI0.I0000O, this.I0000O) != 0 || this.I0000oI00 != oo0l0OoolI0.I0000oI00 || Float.compare(oo0l0OoolI0.I0001Ioi1lo, this.I0001Ioi1lo) != 0 || Float.compare(oo0l0OoolI0.I000II, this.I000II) != 0 || Float.compare(oo0l0OoolI0.I000O01llI0, this.I000O01llI0) != 0 || Float.compare(oo0l0OoolI0.I000OOo1O, this.I000OOo1O) != 0 || Float.compare(oo0l0OoolI0.I000OiO, this.I000OiO) != 0 || Float.compare(oo0l0OoolI0.I000lI, this.I000lI) != 0 || this.I000o00OoI0I != oo0l0OoolI0.I000o00OoI0I || !this.I00000oIO.equals(oo0l0OoolI0.I00000oIO) || !Arrays.equals(this.I000iOII, oo0l0OoolI0.I000iOII)) {
/* 168 */               return false;
                    }
/* 153 */           OIll100 oIll100 = this.I000l1;
/* 155 */           OIll100 oIll1002 = oo0l0OoolI0.I000l1;
                    return oIll100 != null ? oIll100.equals(oIll1002) : oIll1002 == null;
                }

                public final int hashCode() {
/* 95 */            int iHashCode = (Arrays.hashCode(this.I000iOII) + ((Float.floatToIntBits(this.I000OiO) + ((Float.floatToIntBits(this.I000OOo1O) + ((Float.floatToIntBits(this.I000O01llI0) + ((Float.floatToIntBits(this.I000II) + ((Float.floatToIntBits(this.I0001Ioi1lo) + ((((Float.floatToIntBits(this.I0000O) + ((Float.floatToIntBits(this.I0000Il00O) + ((Float.floatToIntBits(this.I00000oOI) + (Arrays.hashCode(this.I00000oIO.I00iOIl) * 31)) * 31)) * 31)) * 31) + this.I0000oI00) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
/* 97 */            OIll100 oIll100 = this.I000l1;
/* 123 */           return ((Float.floatToIntBits(this.I000lI) + ((iHashCode + (oIll100 != null ? oIll100.I00iOIl.hashCode() : 0)) * 31)) * 31) + this.I000o00OoI0I;
                }

                public final String toString() {
/* 1 */             return this.I00100l0;
                }
            }
