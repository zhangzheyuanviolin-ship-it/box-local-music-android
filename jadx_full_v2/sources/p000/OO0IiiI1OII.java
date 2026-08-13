            package p000;

            import android.graphics.Path;
            import java.util.List;
            
            public final class OO0IiiI1OII extends Oolo0Oli0lOo {
                public III11l1I I00000oOI;
                public float I0000Il00O;
                public List I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;
                public III11l1I I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public float I000OiO;
                public float I000iOII;
                public float I000l1;
                public float I000lI;
                public boolean I000o00OoI0I;
                public boolean I000oI1ioi;
                public boolean I00100l0;
                public OlOooI0l0011 I00100o1O0lo;
                public I0ol0lI I0010I0i;
                public I0ol0lI I0010o;
                public I0ol0lI I00111O;
                public O0ioIllo0i1 I001IIilI0O;

                @Override
                public final void I00000oIO(IilloIOOO0i iilloIOOO0i) {
                    OlOooI0l0011 olOooI0l0011;
/* 5 */             if (this.I000o00OoI0I) {
/* 11 */                lI0000o0l.I00000oOI(this.I0000O, this.I0010I0i);
/* 14 */                I0000oI00();
                    } else if (this.I00100l0) {
/* 22 */                I0000oI00();
                    }
/* 26 */            this.I000o00OoI0I = false;
/* 28 */            this.I00100l0 = false;
/* 30 */            III11l1I iII11l1I = this.I00000oOI;
/* 32 */            if (iII11l1I != null) {
/* 44 */                IilloIOOO0i.I00OIo(iilloIOOO0i, this.I0010o, iII11l1I, this.I0000Il00O, null, null, 56);
                    }
/* 47 */            III11l1I iII11l1I2 = this.I000II;
/* 49 */            if (iII11l1I2 != null) {
/* 51 */                OlOooI0l0011 olOooI0l00112 = this.I00100o1O0lo;
/* 55 */                if (this.I000oI1ioi || olOooI0l00112 == null) {
/* 75 */                    OlOooI0l0011 olOooI0l00113 = new OlOooI0l0011(this.I0001Ioi1lo, this.I000OiO, this.I000O01llI0, this.I000OOo1O, null, 16);
/* 78 */                    this.I00100o1O0lo = olOooI0l00113;
/* 80 */                    this.I000oI1ioi = false;
/* 82 */                    olOooI0l0011 = olOooI0l00113;
                        } else {
/* 60 */                    olOooI0l0011 = olOooI0l00112;
                        }
/* 92 */                IilloIOOO0i.I00OIo(iilloIOOO0i, this.I0010o, iII11l1I2, this.I0000oI00, olOooI0l0011, null, 48);
                    }
                }

                public final void I0000oI00() {
/* 1 */             O0ioIllo0i1 o0ioIllo0i1 = this.I001IIilI0O;
/* 3 */             I0ol0lI i0ol0lI = this.I0010I0i;
/* 12 */            if (this.I000iOII == 0.0f && this.I000l1 == 1.0f) {
/* 20 */                this.I0010o = i0ol0lI;
/* 22 */                return;
                    }
/* 29 */            if (O0000Ioio00.I0000O(this.I0010o, i0ol0lI)) {
/* 35 */                this.I0010o = I0olIlI11.I00000oIO();
                    } else {
/* 42 */                Path.FillType fillType = this.I0010o.I00000oIO.getFillType();
/* 46 */                Path.FillType fillType2 = Path.FillType.EVEN_ODD;
/* 53 */                boolean z = fillType == fillType2;
/* 56 */                this.I0010o.I000OOo1O();
/* 61 */                Path path = this.I0010o.I00000oIO;
/* 63 */                if (!z) {
/* 66 */                    fillType2 = Path.FillType.WINDING;
                        }
/* 68 */                path.setFillType(fillType2);
                    }
/* 77 */            ((I0olIil0) o0ioIllo0i1.getValue()).I00000oOI(i0ol0lI);
/* 88 */            float length = ((I0olIil0) o0ioIllo0i1.getValue()).I00000oIO.getLength();
/* 92 */            float f = this.I000iOII;
/* 94 */            float f2 = this.I000lI;
/* 98 */            float f3 = ((f + f2) % 1.0f) * length;
/* 103 */           float f4 = ((this.I000l1 + f2) % 1.0f) * length;
/* 106 */           if (f3 <= f4) {
/* 162 */               ((I0olIil0) o0ioIllo0i1.getValue()).I00000oIO(f3, f4, this.I0010o);
/* 245 */               return;
                    }
/* 108 */           I0ol0lI i0ol0lII00000oIO = this.I00111O;
/* 110 */           if (i0ol0lII00000oIO == null) {
/* 113 */               i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 117 */               this.I00111O = i0ol0lII00000oIO;
                    }
/* 119 */           i0ol0lII00000oIO.I000O01llI0();
/* 128 */           ((I0olIil0) o0ioIllo0i1.getValue()).I00000oIO(f3, length, i0ol0lII00000oIO);
/* 133 */           I0ol0lI.I00000oIO(this.I0010o, i0ol0lII00000oIO);
/* 136 */           i0ol0lII00000oIO.I000O01llI0();
/* 145 */           ((I0olIil0) o0ioIllo0i1.getValue()).I00000oIO(0.0f, f4, i0ol0lII00000oIO);
/* 150 */           I0ol0lI.I00000oIO(this.I0010o, i0ol0lII00000oIO);
                }

                public final String toString() {
/* 3 */             return this.I0010I0i.toString();
                }
            }
