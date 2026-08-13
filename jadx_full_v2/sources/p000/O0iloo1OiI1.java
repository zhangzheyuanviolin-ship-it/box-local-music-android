            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class O0iloo1OiI1 extends O0iiOOl {
                public final O0io0olo I00000oOI;
                public final IlliIl1l11O I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O0iloo1OiI1(O0io0olo o0io0olo, IlliIl1l11O illiIl1l11O, String str) {
/* 5 */             super(str);
/* 1 */             this.I00000oOI = o0io0olo;
/* 3 */             this.I0000Il00O = illiIl1l11O;
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
/* 1 */             O0io0olo o0io0olo = this.I00000oOI;
/* 3 */             O0ilio1l0 o0ilio1l0 = o0io0olo.I00ioIO;
/* 9 */             o0ilio1l0.I00iOIl = o1iOIoOiO0.getLayoutDirection();
/* 15 */            o0ilio1l0.I00iiI = o1iOIoOiO0.I00000oIO();
/* 21 */            o0ilio1l0.I00iiO = o1iOIoOiO0.I00Ol00();
/* 23 */            boolean zI00OloOo = o1iOIoOiO0.I00OloOo();
/* 27 */            IlliIl1l11O illiIl1l11O = this.I0000Il00O;
/* 29 */            int i = 0;
/* 30 */            if (zI00OloOo || o0io0olo.I00iOIl.I00l0I0l0lO1 == null) {
/* 71 */                o0io0olo.I00iio = 0;
/* 81 */                O1iOIo0o0 o1iOIo0o0 = (O1iOIo0o0) illiIl1l11O.invoke(o0ilio1l0, IOo0oO11ll1O.I00000oIO(j));
/* 83 */                int i2 = o0io0olo.I00iio;
/* 88 */                O0iliol11l o0iliol11l = new O0iliol11l(1);
/* 91 */                o0iliol11l.I0000Il00O = o0io0olo;
/* 93 */                o0iliol11l.I0000O = i2;
/* 95 */                o0iliol11l.I0000oI00 = o1iOIo0o0;
/* 97 */                o0iliol11l.I00000oOI = o1iOIo0o0;
/* 99 */                VarHandle.storeStoreFence();
/* 408 */               return o0iliol11l;
                    }
/* 38 */            o0io0olo.I00ilI0I1 = 0;
/* 50 */            O1iOIo0o0 o1iOIo0o02 = (O1iOIo0o0) illiIl1l11O.invoke(o0io0olo.I00l0I0l0lO1, IOo0oO11ll1O.I00000oIO(j));
/* 52 */            int i3 = o0io0olo.I00ilI0I1;
/* 56 */            O0iliol11l o0iliol11l2 = new O0iliol11l(i);
/* 59 */            o0iliol11l2.I0000Il00O = o0io0olo;
/* 61 */            o0iliol11l2.I0000O = i3;
/* 63 */            o0iliol11l2.I0000oI00 = o1iOIo0o02;
/* 65 */            o0iliol11l2.I00000oOI = o1iOIo0o02;
/* 67 */            VarHandle.storeStoreFence();
/* 70 */            return o0iliol11l2;
                }
            }
