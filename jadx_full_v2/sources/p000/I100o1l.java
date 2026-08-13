            package p000;

            import android.graphics.Paint;
            import android.graphics.Shader;
            import android.text.TextPaint;
            import java.lang.invoke.VarHandle;
            
            public final class I100o1l extends TextPaint {
                public I0oiil10Ili I00000oIO;
                public OlooIOI0O I00000oOI;
                public int I0000Il00O;
                public OioOII0oI I0000O;
                public IOOiio0i I0000oI00;
                public III11l1I I0001Ioi1lo;
                public IiO0o1I I000II;
                public Ol0i1I I000O01llI0;
                public Iilloo0IOoIo I000OOo1O;

                public final I0oiil10Ili I00000oIO() {
/* 1 */             I0oiil10Ili i0oiil10Ili = this.I00000oIO;
/* 3 */             if (i0oiil10Ili != null) {
/* 5 */                 return i0oiil10Ili;
                    }
/* 8 */             I0oiil10Ili i0oiil10Ili2 = new I0oiil10Ili(this);
/* 11 */            this.I00000oIO = i0oiil10Ili2;
/* 20 */            return i0oiil10Ili2;
                }

                public final void I00000oOI(int i) {
/* 3 */             if (i == this.I0000Il00O) {
/* 5 */                 return;
                    }
/* 10 */            I00000oIO().I0010I0i(i);
/* 13 */            this.I0000Il00O = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(III11l1I iII11l1I, long j, float f) {
/* 2 */             if (iII11l1I == null) {
/* 4 */                 this.I000II = null;
/* 6 */                 this.I0001Ioi1lo = null;
/* 8 */                 this.I000O01llI0 = null;
/* 10 */                setShader(null);
/* 13 */                return;
                    }
/* 16 */            if (iII11l1I instanceof OlI00IIlOO) {
/* 26 */                I0000O(lOl01i0i00.I00000oIO(f, ((OlI00IIlOO) iII11l1I).I00000oIO));
/* 29 */                return;
                    }
/* 32 */            if (!(iII11l1I instanceof OioIoiOi)) {
/* 117 */               I000II.I00000oIO();
/* 408 */               return;
                    }
/* 41 */            if (O0000Ioio00.I0000O(this.I0001Ioi1lo, iII11l1I)) {
/* 43 */                Ol0i1I ol0i1I = this.I000O01llI0;
/* 55 */                if (!(ol0i1I == null ? false : Ol0i1I.I00000oOI(ol0i1I.I00000oIO, j))) {
                        }
                    } else if (j != 9205357640488583168L) {
/* 66 */                this.I0001Ioi1lo = iII11l1I;
/* 72 */                this.I000O01llI0 = Ol0i1I.I00000oIO(j);
/* 76 */                I100OioI1OOo i100OioI1OOo = new I100OioI1OOo(0);
/* 79 */                i100OioI1OOo.I00iiO = iII11l1I;
/* 81 */                i100OioI1OOo.I00iiI = j;
/* 83 */                VarHandle.storeStoreFence();
/* 90 */                this.I000II = Ol1llolil.I00000oOI(i100OioI1OOo);
                    }
/* 92 */            I0oiil10Ili i0oiil10IliI00000oIO = I00000oIO();
/* 96 */            IiO0o1I iiO0o1I = this.I000II;
/* 108 */           i0oiil10IliI00000oIO.I001i1O0Ol(iiO0o1I != null ? (Shader) iiO0o1I.getValue() : null);
/* 111 */           this.I0000oI00 = null;
/* 113 */           iOIo1I0O.I00000oIO(this, f);
                }

                public final void I0000O(long j) {
/* 1 */             IOOiio0i iOOiio0i = this.I0000oI00;
/* 13 */            if ((iOOiio0i == null ? false : Ooi0i1.I00000oOI(iOOiio0i.I00000oIO, j)) || j == 16) {
/* 77 */                return;
                    }
/* 25 */            this.I0000oI00 = IOOiio0i.I00000oIO(j);
/* 31 */            setColor(iiO01ll11o1l.I000OOo1O(j));
/* 35 */            this.I000II = null;
/* 37 */            this.I0001Ioi1lo = null;
/* 39 */            this.I000O01llI0 = null;
/* 41 */            setShader(null);
                }

                public final void I0000oI00(Iilloo0IOoIo iilloo0IOoIo) {
/* 1 */             if (iilloo0IOoIo == null || O0000Ioio00.I0000O(this.I000OOo1O, iilloo0IOoIo)) {
/* 168 */               return;
                    }
/* 12 */            this.I000OOo1O = iilloo0IOoIo;
/* 20 */            if (iilloo0IOoIo.equals(IlIl1I110o0I.I00000oIO)) {
/* 24 */                setStyle(Paint.Style.FILL);
/* 27 */                return;
                    }
/* 30 */            if (!(iilloo0IOoIo instanceof OlOooI0l0011)) {
/* 92 */                I000II.I00000oIO();
/* 168 */               return;
                    }
/* 37 */            I00000oIO().I001lIiIIo1O(1);
/* 44 */            OlOooI0l0011 olOooI0l0011 = (OlOooI0l0011) iilloo0IOoIo;
/* 48 */            I00000oIO().I001l0I00(olOooI0l0011.I00000oIO);
/* 51 */            I0oiil10Ili i0oiil10IliI00000oIO = I00000oIO();
/* 61 */            ((Paint) i0oiil10IliI00000oIO.I00iiO).setStrokeMiter(olOooI0l0011.I00000oOI);
/* 70 */            I00000oIO().I001iOo1i0O(olOooI0l0011.I0000O);
/* 79 */            I00000oIO().I001i1lo1io(olOooI0l0011.I0000Il00O);
/* 88 */            I00000oIO().I001IO000(olOooI0l0011.I0000oI00);
                }

                public final void I0001Ioi1lo(OioOII0oI oioOII0oI) {
/* 1 */             if (oioOII0oI == null || O0000Ioio00.I0000O(this.I0000O, oioOII0oI)) {
/* 77 */                return;
                    }
/* 12 */            this.I0000O = oioOII0oI;
/* 20 */            if (oioOII0oI.equals(OioOII0oI.I0000O)) {
/* 22 */                clearShadowLayer();
/* 25 */                return;
                    }
/* 26 */            OioOII0oI oioOII0oI2 = this.I0000O;
/* 28 */            float f = oioOII0oI2.I0000Il00O;
/* 33 */            if (f == 0.0f) {
/* 35 */                f = Float.MIN_VALUE;
                    }
/* 69 */            setShadowLayer(f, Float.intBitsToFloat((int) (oioOII0oI2.I00000oOI >> 32)), Float.intBitsToFloat((int) (this.I0000O.I00000oOI & 4294967295L)), iiO01ll11o1l.I000OOo1O(this.I0000O.I00000oIO));
                }

                public final void I000II(OlooIOI0O olooIOI0O) {
/* 1 */             if (olooIOI0O == null || O0000Ioio00.I0000O(this.I00000oOI, olooIOI0O)) {
/* 77 */                return;
                    }
/* 12 */            this.I00000oOI = olooIOI0O;
/* 14 */            int i = olooIOI0O.I00000oIO;
/* 25 */            setUnderlineText((i | 1) == i);
/* 30 */            int i2 = this.I00000oOI.I00000oIO;
/* 37 */            setStrikeThruText((i2 | 2) == i2);
                }
            }
