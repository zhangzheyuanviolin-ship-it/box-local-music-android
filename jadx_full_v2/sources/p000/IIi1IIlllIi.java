            package p000;

            import android.graphics.Bitmap;
            import java.io.EOFException;
            
/* 141 */   public final class IIi1IIlllIi {
                public final O0ioIllo0i1 I00000oIO;
                public final O0ioIllo0i1 I00000oOI;
                public final long I0000Il00O;
                public final long I0000O;
                public final boolean I0000oI00;
                public final Io1Io0OOi011 I0001Ioi1lo;

                public IIi1IIlllIi(OOliO0 oOliO0) throws NumberFormatException, EOFException {
/* 4 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 16 */            this.I00000oIO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IIi1IIOlIOi(this, 0));
/* 28 */            this.I00000oOI = l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IIi1IIOlIOi(this, 1));
/* 43 */            this.I0000Il00O = Long.parseLong(oOliO0.I00IoO0(Long.MAX_VALUE));
/* 53 */            this.I0000O = Long.parseLong(oOliO0.I00IoO0(Long.MAX_VALUE));
/* 67 */            this.I0000oI00 = Integer.parseInt(oOliO0.I00IoO0(Long.MAX_VALUE)) > 0;
/* 73 */            int i = Integer.parseInt(oOliO0.I00IoO0(Long.MAX_VALUE));
/* 79 */            Io1IlO1I1i io1IlO1I1i = new Io1IlO1I1i();
/* 83 */            for (int i2 = 0; i2 < i; i2++) {
/* 85 */                String strI00IoO0 = oOliO0.I00IoO0(Long.MAX_VALUE);
/* 89 */                Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 94 */                int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(strI00IoO0, ':', 0, 6);
/* 99 */                if (iI001i1O0Ol == -1) {
/* 131 */                   I000II.I0010I0i("Unexpected header: ".concat(strI00IoO0));
/* 135 */                   throw null;
                        }
/* 119 */               io1IlO1I1i.I00000oOI(OlOoOIi0o.I00OIo(strI00IoO0.substring(0, iI001i1O0Ol)).toString(), strI00IoO0.substring(iI001i1O0Ol + 1));
                    }
/* 140 */           this.I0001Ioi1lo = io1IlO1I1i.I0000Il00O();
                }

                public final void I00000oIO(OOliIlo01o oOliIlo01o) {
/* 3 */             oOliIlo01o.I0000Il00O(this.I0000Il00O);
/* 8 */             oOliIlo01o.writeByte(10);
/* 13 */            oOliIlo01o.I0000Il00O(this.I0000O);
/* 16 */            oOliIlo01o.writeByte(10);
/* 28 */            oOliIlo01o.I0000Il00O(this.I0000oI00 ? 1L : 0L);
/* 31 */            oOliIlo01o.writeByte(10);
/* 34 */            Io1Io0OOi011 io1Io0OOi011 = this.I0001Ioi1lo;
/* 41 */            oOliIlo01o.I0000Il00O(io1Io0OOi011.size());
/* 44 */            oOliIlo01o.writeByte(10);
/* 47 */            int size = io1Io0OOi011.size();
/* 52 */            for (int i = 0; i < size; i++) {
/* 58 */                oOliIlo01o.I00OilO00Il(io1Io0OOi011.I0000O(i));
/* 63 */                oOliIlo01o.I00OilO00Il(": ");
/* 70 */                oOliIlo01o.I00OilO00Il(io1Io0OOi011.I000OiO(i));
/* 73 */                oOliIlo01o.writeByte(10);
                    }
                }

/* 142 */       public IIi1IIlllIi(Oi1001l0Il oi1001l0Il) {
/* 144 */           O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
                    this.I00000oIO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IIi1IIOlIOi(this, 0));
/* 145 */           this.I00000oOI = l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IIi1IIOlIOi(this, 1));
/* 147 */           this.I0000Il00O = oi1001l0Il.I00li1OI;
/* 149 */           this.I0000O = oi1001l0Il.I00ll1;
/* 151 */           this.I0000oI00 = oi1001l0Il.I00ilI0I1 != null;
/* 153 */           this.I0001Ioi1lo = oi1001l0Il.I00ilO0;
                }
            }
