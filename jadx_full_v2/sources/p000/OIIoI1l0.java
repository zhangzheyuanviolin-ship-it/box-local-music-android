            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public abstract class OIIoI1l0 {
                public final Oii00o1ll I00000oIO;
                public final IlliIl1l11O I00000oOI;
                public IiIooOOOI I0000Il00O;
                public boolean I0000O;
                public final IoloOio0I I0000oI00;

                public OIIoI1l0(Oii00o1ll oii00o1ll, IlliIl1l11O illiIl1l11O, IiIooOOOI iiIooOOOI) {
/* 4 */             this.I00000oIO = oii00o1ll;
/* 6 */             this.I00000oOI = illiIl1l11O;
/* 8 */             this.I0000Il00O = iiIooOOOI;
/* 14 */            IoloOio0I ioloOio0I = new IoloOio0I(10);
/* 23 */            ioloOio0I.I00iiI = new OooIlilo(true);
/* 30 */            ioloOio0I.I00iiO = new OooIlilo(true);
/* 32 */            VarHandle.storeStoreFence();
/* 35 */            this.I0000oI00 = ioloOio0I;
                }

                public static void I00000oIO(OO1Oooio101 oO1Oooio101) {
/* 1 */             List list = oO1Oooio101.I00000oIO;
/* 6 */             int size = list.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 19 */                ((OO1il00lI) list.get(i)).I00000oIO();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(IlliIl1l11O illiIl1l11O, IOoilo iOoilo) throws Throwable {
                    OIIoI001 oIIoI001;
/* 3 */             if (iOoilo instanceof OIIoI001) {
/* 6 */                 oIIoI001 = (OIIoI001) iOoilo;
/* 8 */                 int i = oIIoI001.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oIIoI001.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oIIoI001 = new OIIoI001(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oIIoI001.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oIIoI001.I00iiO;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 50 */                this.I0000O = true;
/* 55 */                O1iIlllIoo o1iIlllIoo = new O1iIlllIoo(this, illiIl1l11O, iOoil1iiIilo, 7);
/* 58 */                oIIoI001.I00iiO = 1;
/* 66 */                OliiiIoillI oliiiIoillI = new OliiiIoillI(oIIoI001, oIIoI001.getContext());
/* 73 */                if (li0011.I00000oIO(oliiiIoillI, true, oliiiIoillI, o1iIlllIoo) == ii0111o) {
/* 75 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 77 */            this.I0000O = false;
/* 79 */            return OoiIlOl1iI.I00000oIO;
                }
            }
