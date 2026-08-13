            package p000;
            
            public abstract class IloooliI0I implements O1lIi0I01l1, Cloneable {
                public final Io00Io0IO11 I00iOIl;
                public Io00Io0IO11 I00iiI;

                public IloooliI0I(Io00Io0IO11 io00Io0IO11) {
/* 4 */             this.I00iOIl = io00Io0IO11;
/* 10 */            if (io00Io0IO11.I000o00OoI0I()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 49 */                throw null;
                    }
/* 16 */            this.I00iiI = io00Io0IO11.I0010I0i();
                }

                public static void I0001Ioi1lo(Object obj, Object obj2) {
/* 1 */             OOi1lIO1Oi oOi1lIO1Oi = OOi1lIO1Oi.I0000Il00O;
/* 3 */             oOi1lIO1Oi.getClass();
/* 14 */            oOi1lIO1Oi.I00000oIO(obj.getClass()).I00000oIO(obj, obj2);
                }

                public final Io00Io0IO11 I00000oOI() {
/* 1 */             Io00Io0IO11 io00Io0IO11I0000Il00O = I0000Il00O();
/* 5 */             io00Io0IO11I0000Il00O.getClass();
/* 13 */            if (Io00Io0IO11.I000lI(io00Io0IO11I0000Il00O, true)) {
/* 15 */                return io00Io0IO11I0000Il00O;
                    }
/* 29 */            throw new OoiI1iioio1();
                }

                public final Io00Io0IO11 I0000Il00O() {
/* 3 */             boolean zI000o00OoI0I = this.I00iiI.I000o00OoI0I();
/* 7 */             Io00Io0IO11 io00Io0IO11 = this.I00iiI;
/* 9 */             if (!zI000o00OoI0I) {
/* 11 */                return io00Io0IO11;
                    }
/* 12 */            io00Io0IO11.getClass();
/* 15 */            OOi1lIO1Oi oOi1lIO1Oi = OOi1lIO1Oi.I0000Il00O;
/* 17 */            oOi1lIO1Oi.getClass();
/* 28 */            oOi1lIO1Oi.I00000oIO(io00Io0IO11.getClass()).I00000oOI(io00Io0IO11);
/* 31 */            io00Io0IO11.I000oI1ioi();
/* 34 */            return this.I00iiI;
                }

                public final IloooliI0I I0000O() {
/* 3 */             IloooliI0I iloooliI0II00100l0 = this.I00iOIl.I0000O();
/* 11 */            iloooliI0II00100l0.I00iiI = I0000Il00O();
/* 29 */            return iloooliI0II00100l0;
                }

                public final void I0000oI00() {
/* 7 */             if (this.I00iiI.I000o00OoI0I()) {
/* 29 */                return;
                    }
/* 11 */            Io00Io0IO11 io00Io0IO11I0010I0i = this.I00iOIl.I0010I0i();
/* 17 */            I0001Ioi1lo(io00Io0IO11I0010I0i, this.I00iiI);
/* 20 */            this.I00iiI = io00Io0IO11I0010I0i;
                }
            }
