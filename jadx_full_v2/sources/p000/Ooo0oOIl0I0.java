            package p000;

            import android.graphics.Matrix;
            import android.graphics.Paint;
            import java.util.ArrayList;
            
/* 233 */   public final class Ooo0oOIl0I0 extends Ooo0oOOIl {
                public final Matrix I00000oIO;
                public final ArrayList I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;
                public float I000II;
                public float I000O01llI0;
                public float I000OOo1O;
                public final Matrix I000OiO;
                public String I000iOII;

                /* JADX WARN: Multi-variable type inference failed */
                public Ooo0oOIl0I0(Ooo0oOIl0I0 ooo0oOIl0I0, I1Io0i0II i1Io0i0II) {
                    Ooo0lOI ooo0lOI;
/* 9 */             this.I00000oIO = new Matrix();
/* 16 */            this.I00000oOI = new ArrayList();
/* 19 */            this.I0000Il00O = 0.0f;
/* 21 */            this.I0000O = 0.0f;
/* 23 */            this.I0000oI00 = 0.0f;
/* 27 */            this.I0001Ioi1lo = 1.0f;
/* 29 */            this.I000II = 1.0f;
/* 31 */            this.I000O01llI0 = 0.0f;
/* 33 */            this.I000OOo1O = 0.0f;
/* 37 */            Matrix matrix = new Matrix();
/* 40 */            this.I000OiO = matrix;
/* 43 */            this.I000iOII = null;
/* 47 */            this.I0000Il00O = ooo0oOIl0I0.I0000Il00O;
/* 51 */            this.I0000O = ooo0oOIl0I0.I0000O;
/* 55 */            this.I0000oI00 = ooo0oOIl0I0.I0000oI00;
/* 59 */            this.I0001Ioi1lo = ooo0oOIl0I0.I0001Ioi1lo;
/* 63 */            this.I000II = ooo0oOIl0I0.I000II;
/* 67 */            this.I000O01llI0 = ooo0oOIl0I0.I000O01llI0;
/* 71 */            this.I000OOo1O = ooo0oOIl0I0.I000OOo1O;
/* 73 */            String str = ooo0oOIl0I0.I000iOII;
/* 75 */            this.I000iOII = str;
/* 77 */            if (str != null) {
/* 79 */                i1Io0i0II.put(str, this);
                    }
/* 84 */            matrix.set(ooo0oOIl0I0.I000OiO);
/* 87 */            ArrayList arrayList = ooo0oOIl0I0.I00000oOI;
/* 94 */            for (int i = 0; i < arrayList.size(); i++) {
/* 96 */                Object obj = arrayList.get(i);
/* 102 */               if (obj instanceof Ooo0oOIl0I0) {
/* 113 */                   this.I00000oOI.add(new Ooo0oOIl0I0((Ooo0oOIl0I0) obj, i1Io0i0II));
                        } else {
/* 119 */                   if (obj instanceof Ooo0lOl0O1l0) {
/* 123 */                       Ooo0lOl0O1l0 ooo0lOl0O1l0 = (Ooo0lOl0O1l0) obj;
/* 125 */                       Ooo0lOl0O1l0 ooo0lOl0O1l02 = new Ooo0lOl0O1l0(ooo0lOl0O1l0);
/* 128 */                       ooo0lOl0O1l02.I0000oI00 = 0.0f;
/* 130 */                       ooo0lOl0O1l02.I000II = 1.0f;
/* 132 */                       ooo0lOl0O1l02.I000O01llI0 = 1.0f;
/* 134 */                       ooo0lOl0O1l02.I000OOo1O = 0.0f;
/* 136 */                       ooo0lOl0O1l02.I000OiO = 1.0f;
/* 138 */                       ooo0lOl0O1l02.I000iOII = 0.0f;
/* 142 */                       ooo0lOl0O1l02.I000l1 = Paint.Cap.BUTT;
/* 146 */                       ooo0lOl0O1l02.I000lI = Paint.Join.MITER;
/* 150 */                       ooo0lOl0O1l02.I000o00OoI0I = 4.0f;
/* 154 */                       ooo0lOl0O1l02.I0000O = ooo0lOl0O1l0.I0000O;
/* 158 */                       ooo0lOl0O1l02.I0000oI00 = ooo0lOl0O1l0.I0000oI00;
/* 162 */                       ooo0lOl0O1l02.I000II = ooo0lOl0O1l0.I000II;
/* 166 */                       ooo0lOl0O1l02.I0001Ioi1lo = ooo0lOl0O1l0.I0001Ioi1lo;
/* 170 */                       ooo0lOl0O1l02.I0000Il00O = ooo0lOl0O1l0.I0000Il00O;
/* 174 */                       ooo0lOl0O1l02.I000O01llI0 = ooo0lOl0O1l0.I000O01llI0;
/* 178 */                       ooo0lOl0O1l02.I000OOo1O = ooo0lOl0O1l0.I000OOo1O;
/* 182 */                       ooo0lOl0O1l02.I000OiO = ooo0lOl0O1l0.I000OiO;
/* 186 */                       ooo0lOl0O1l02.I000iOII = ooo0lOl0O1l0.I000iOII;
/* 190 */                       ooo0lOl0O1l02.I000l1 = ooo0lOl0O1l0.I000l1;
/* 194 */                       ooo0lOl0O1l02.I000lI = ooo0lOl0O1l0.I000lI;
/* 198 */                       ooo0lOl0O1l02.I000o00OoI0I = ooo0lOl0O1l0.I000o00OoI0I;
                                ooo0lOI = ooo0lOl0O1l02;
                            } else {
/* 203 */                       if (!(obj instanceof Ooo0lOI)) {
/* 230 */                           I000II.I001IO000("Unknown object in the tree!");
/* 233 */                           throw null;
                                }
/* 209 */                       ooo0lOI = new Ooo0lOI((Ooo0lOI) obj);
                            }
/* 214 */                   this.I00000oOI.add(ooo0lOI);
/* 217 */                   Object obj2 = ooo0lOI.I00000oOI;
/* 219 */                   if (obj2 != null) {
/* 221 */                       i1Io0i0II.put(obj2, ooo0lOI);
                            }
                        }
                    }
                }

                @Override
                public final boolean I00000oIO() {
/* 2 */             int i = 0;
                    while (true) {
/* 3 */                 ArrayList arrayList = this.I00000oOI;
/* 9 */                 if (i >= arrayList.size()) {
/* 1 */                     return false;
                        }
/* 21 */                if (((Ooo0oOOIl) arrayList.get(i)).I00000oIO()) {
/* 23 */                    return true;
                        }
/* 25 */                i++;
                    }
                }

                @Override
                public final boolean I00000oOI(int[] iArr) {
/* 1 */             int i = 0;
/* 2 */             boolean zI00000oOI = false;
                    while (true) {
/* 3 */                 ArrayList arrayList = this.I00000oOI;
/* 9 */                 if (i >= arrayList.size()) {
/* 29 */                    return zI00000oOI;
                        }
/* 21 */                zI00000oOI |= ((Ooo0oOOIl) arrayList.get(i)).I00000oOI(iArr);
/* 22 */                i++;
                    }
                }

                public final void I0000Il00O() {
/* 1 */             Matrix matrix = this.I000OiO;
/* 3 */             matrix.reset();
/* 12 */            matrix.postTranslate(-this.I0000O, -this.I0000oI00);
/* 19 */            matrix.postScale(this.I0001Ioi1lo, this.I000II);
/* 25 */            matrix.postRotate(this.I0000Il00O, 0.0f, 0.0f);
/* 38 */            matrix.postTranslate(this.I000O01llI0 + this.I0000O, this.I000OOo1O + this.I0000oI00);
                }

                public String getGroupName() {
/* 1 */             return this.I000iOII;
                }

                public Matrix getLocalMatrix() {
/* 1 */             return this.I000OiO;
                }

                public float getPivotX() {
/* 1 */             return this.I0000O;
                }

                public float getPivotY() {
/* 1 */             return this.I0000oI00;
                }

                public float getRotation() {
/* 1 */             return this.I0000Il00O;
                }

                public float getScaleX() {
/* 1 */             return this.I0001Ioi1lo;
                }

                public float getScaleY() {
/* 1 */             return this.I000II;
                }

                public float getTranslateX() {
/* 1 */             return this.I000O01llI0;
                }

                public float getTranslateY() {
/* 1 */             return this.I000OOo1O;
                }

                public void setPivotX(float f) {
/* 5 */             if (f != this.I0000O) {
/* 7 */                 this.I0000O = f;
/* 9 */                 I0000Il00O();
                    }
                }

                public void setPivotY(float f) {
/* 5 */             if (f != this.I0000oI00) {
/* 7 */                 this.I0000oI00 = f;
/* 9 */                 I0000Il00O();
                    }
                }

                public void setRotation(float f) {
/* 5 */             if (f != this.I0000Il00O) {
/* 7 */                 this.I0000Il00O = f;
/* 9 */                 I0000Il00O();
                    }
                }

                public void setScaleX(float f) {
/* 5 */             if (f != this.I0001Ioi1lo) {
/* 7 */                 this.I0001Ioi1lo = f;
/* 9 */                 I0000Il00O();
                    }
                }

                public void setScaleY(float f) {
/* 5 */             if (f != this.I000II) {
/* 7 */                 this.I000II = f;
/* 9 */                 I0000Il00O();
                    }
                }

                public void setTranslateX(float f) {
/* 5 */             if (f != this.I000O01llI0) {
/* 7 */                 this.I000O01llI0 = f;
/* 9 */                 I0000Il00O();
                    }
                }

                public void setTranslateY(float f) {
/* 5 */             if (f != this.I000OOo1O) {
/* 7 */                 this.I000OOo1O = f;
/* 9 */                 I0000Il00O();
                    }
                }

/* 234 */       public Ooo0oOIl0I0() {
/* 236 */           this.I00000oIO = new Matrix();
/* 237 */           this.I00000oOI = new ArrayList();
/* 238 */           this.I0000Il00O = 0.0f;
/* 239 */           this.I0000O = 0.0f;
/* 240 */           this.I0000oI00 = 0.0f;
/* 241 */           this.I0001Ioi1lo = 1.0f;
/* 242 */           this.I000II = 1.0f;
/* 243 */           this.I000O01llI0 = 0.0f;
/* 244 */           this.I000OOo1O = 0.0f;
/* 245 */           this.I000OiO = new Matrix();
/* 246 */           this.I000iOII = null;
                }
            }
