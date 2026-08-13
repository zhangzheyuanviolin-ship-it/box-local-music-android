            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O1o1iol1oO0 extends I0100o111I {
                public OIooliIO0 I00l0OO0IO;
                public boolean I00li1OI;

                @Override
                public final void I00000oIO(int i, IloI0lOlll1 iloI0lOlll1) {
/* 4 */             iloI0lOlll1.I00i0O(576708319);
/* 17 */            int i2 = i | (iloI0lOlll1.I000OOo1O(this) ? 4 : 2);
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 46 */                ((IlliIl1l11O) this.I00l0OO0IO.getValue()).invoke(iloI0lOlll1, 0);
                    } else {
/* 50 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 53 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 57 */            if (oOloioIlI001IO000 != null) {
/* 63 */                O1IIii o1IIii = new O1IIii(10);
/* 66 */                o1IIii.I00iiI = this;
/* 68 */                VarHandle.storeStoreFence();
/* 71 */                oOloioIlI001IO000.I0000O = o1IIii;
                    }
                }

                @Override
                public final boolean getShouldCreateCompositionOnAttachedToWindow() {
/* 1 */             return this.I00li1OI;
                }
            }
