            package p000;

            import java.lang.invoke.VarHandle;
            
/* 18 */    public final class IOl0ol01OO1 extends I0100o111I {
                public OIooliIO0 I00l0OO0IO;
                public boolean I00li1OI;

                @Override
                public final void I00000oIO(int i, IloI0lOlll1 iloI0lOlll1) {
/* 4 */             iloI0lOlll1.I00i0O(420213850);
/* 17 */            int i2 = i | (iloI0lOlll1.I000OOo1O(this) ? 4 : 2);
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 40 */                IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00l0OO0IO.getValue();
/* 42 */                if (illiIl1l11O == null) {
/* 47 */                    iloI0lOlll1.I00i01iIIliI(-1238823553);
                        } else {
/* 57 */                    iloI0lOlll1.I00i01iIIliI(98585282);
/* 64 */                    illiIl1l11O.invoke(iloI0lOlll1, 0);
                        }
/* 50 */                iloI0lOlll1.I0010I0i(false);
                    } else {
/* 68 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 71 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 75 */            if (oOloioIlI001IO000 != null) {
/* 81 */                I00oooO i00oooO = new I00oooO(10);
/* 84 */                i00oooO.I00iiI = this;
/* 86 */                VarHandle.storeStoreFence();
/* 89 */                oOloioIlI001IO000.I0000O = i00oooO;
                    }
                }

                @Override
                public CharSequence getAccessibilityClassName() {
/* 3 */             return IOl0ol01OO1.class.getName();
                }

                @Override
                public boolean getShouldCreateCompositionOnAttachedToWindow() {
/* 1 */             return this.I00li1OI;
                }

                public final void setContent(IlliIl1l11O illiIl1l11O) {
/* 2 */             this.I00li1OI = true;
/* 6 */             this.I00l0OO0IO.setValue(illiIl1l11O);
/* 13 */            if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
/* 23 */                I0000O();
                    }
                }

/* 19 */        public static void getShouldCreateCompositionOnAttachedToWindow$annotations() {
                }
            }
