            package p000;

            import java.lang.invoke.VarHandle;
            
/* 16 */    public final class IOoOi11Io0o {
                public final Il0l0iooI I00000oIO;
                public final Il1OOloOIl1 I00000oOI;
                public final OIooO1iiliI I0000Il00O;
                public final Ol0iiil01 I0000O;

                public IOoOi11Io0o(Il0l0iooI il0l0iooI, Il1OOloOIl1 il1OOloOIl1, float f, Ol0iiil01 ol0iiil01) {
/* 4 */             this.I00000oIO = il0l0iooI;
/* 6 */             this.I00000oOI = il1OOloOIl1;
/* 13 */            this.I0000Il00O = new OIooO1iiliI(f);
/* 15 */            this.I0000O = ol0iiil01;
                }

/* 17 */        public IOoOi11Io0o(Il0l0iooI il0l0iooI, Il1OOloOIl1 il1OOloOIl1) {
/* 18 */            I10io1 i10io1 = I10io1.I00iiI;
/* 20 */            Ol0iiil01 ol0iiil01 = new Ol0iiil01();
/* 21 */            ol0iiil01.I00000oIO = i10io1;
/* 22 */            VarHandle.storeStoreFence();
/* 23 */            this(il0l0iooI, il1OOloOIl1, 0.0f, ol0iiil01);
                }
            }
