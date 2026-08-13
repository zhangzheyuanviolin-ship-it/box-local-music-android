            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oi1lioiOilI implements Iol100iI0lO {
                public final boolean I00000oIO;
                public final float I00000oOI;
                public final long I0000Il00O;
                public final OioOIi1o0I I0000O;
                public final boolean I0000oI00;

                public Oi1lioiOilI(boolean z, float f, long j, OioOIi1o0I oioOIi1o0I, boolean z2) {
/* 1 */             if (oioOIi1o0I == null) {
/* 3 */                 Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(f);
/* 16 */                iil1010OI00000oIO = Iil1010O.I0000Il00O(iil1010OI00000oIO.I00iOIl, Float.NaN) ? null : iil1010OI00000oIO;
/* 29 */                oioOIi1o0I = iil1010OI00000oIO != null ? OiI11O1i1.I00000oOI(iil1010OI00000oIO.I00iOIl) : null;
/* 30 */                if (oioOIi1o0I == null) {
/* 33 */                    oioOIi1o0I = iO0ioilo.I00000oIO;
                        }
                    }
/* 38 */            this.I00000oIO = z;
/* 40 */            this.I00000oOI = f;
/* 42 */            this.I0000Il00O = j;
/* 44 */            this.I0000O = oioOIi1o0I;
/* 46 */            this.I0000oI00 = z2;
                }

                @Override
                public final IiIill0O0li1 I00000oIO(OI0lOIiOIOOo oI0lOIiOIOOo) {
/* 4 */             IiIloOloII iiIloOloII = new IiIloOloII(3);
/* 7 */             iiIloOloII.I00000oOI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 14 */            IiIloo1 iiIloo1 = new IiIloo1();
/* 17 */            iiIloo1.I00o101lO = oI0lOIiOIOOo;
/* 21 */            iiIloo1.I00oI0i = this.I00000oIO;
/* 25 */            iiIloo1.I00oII = this.I00000oOI;
/* 27 */            iiIloo1.I00oIiI10 = iiIloOloII;
/* 30 */            iiIloo1.I00oO101o = true;
/* 34 */            iiIloo1.I00oOio10iI1 = this.I0000oI00;
/* 36 */            iiIloo1.I00ol1 = true;
/* 38 */            iiIloo1.I00olI = true;
/* 43 */            IiIloOloII iiIloOloII2 = new IiIloOloII(0);
/* 46 */            iiIloOloII2.I00000oOI = iiIloo1;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            iiIloo1.I00oooO = iiIloOloII2;
/* 55 */            IiIlllIilO iiIlllIilO = new IiIlllIilO(1);
/* 58 */            iiIlllIilO.I00iiI = iiIloo1;
/* 60 */            VarHandle.storeStoreFence();
/* 63 */            iiIloo1.I0100i = iiIlllIilO;
/* 65 */            VarHandle.storeStoreFence();
/* 77 */            return iiIloo1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof Oi1lioiOilI)) {
/* 60 */                return false;
                    }
/* 10 */            Oi1lioiOilI oi1lioiOilI = (Oi1lioiOilI) obj;
/* 16 */            if (this.I00000oIO != oi1lioiOilI.I00000oIO || !Iil1010O.I0000Il00O(this.I00000oOI, oi1lioiOilI.I00000oOI)) {
/* 60 */                return false;
                    }
/* 30 */            long j = oi1lioiOilI.I0000Il00O;
/* 32 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(this.I0000Il00O, j) && this.I0000O.equals(oi1lioiOilI.I0000O) && this.I0000oI00 == oi1lioiOilI.I0000oI00;
                }

                @Override
                public final int hashCode() {
/* 14 */            int iI0000O = OooioIOo1.I0000O(Boolean.hashCode(this.I00000oIO) * 31, 961, this.I00000oOI);
/* 18 */            int i = IOOiio0i.I000oI1ioi;
/* 53 */            return Boolean.hashCode(true) + Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((this.I0000O.hashCode() + IIlIOloOOO.I0000O(this.I0000Il00O, iI0000O, 31)) * 31, 31, true), 31, this.I0000oI00), 31, true);
                }
            }
