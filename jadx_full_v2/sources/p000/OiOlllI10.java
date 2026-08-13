            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class OiOlllI10 {
                public static final OiOlO0o11 I00000oIO = new OiOlO0o11();
                public static final Iii1i0i0lllo I00000oOI = new Iii1i0i0lllo(1);
                public static final OIoIoilI1 I0000Il00O = new OIoIoilI1(1);

                public static O1ooiI111i I00000oIO(Oo0I11 oo0I11, OIilII oIilII, boolean z, boolean z2, OI0lOIiOIOOo oI0lOIiOIOOo) {
/* 3 */             OiOlIoio10oO oiOlIoio10oO = new OiOlIoio10oO();
/* 6 */             oiOlIoio10oO.I00000oIO = oo0I11;
/* 8 */             oiOlIoio10oO.I00000oOI = oIilII;
/* 10 */            oiOlIoio10oO.I0000Il00O = z;
/* 12 */            oiOlIoio10oO.I0000O = z2;
/* 14 */            oiOlIoio10oO.I0000oI00 = oI0lOIiOIOOo;
/* 16 */            VarHandle.storeStoreFence();
/* 399 */           return oiOlIoio10oO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(Oii00o1ll oii00o1ll, long j, IOoilo iOoilo) throws Throwable {
                    OiOliIiOil0 oiOliIiOil0;
                    OOo0lO oOo0lO;
                    Oii00o1ll oii00o1ll2;
/* 3 */             if (iOoilo instanceof OiOliIiOil0) {
/* 6 */                 oiOliIiOil0 = (OiOliIiOil0) iOoilo;
/* 8 */                 int i = oiOliIiOil0.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiOliIiOil0.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiOliIiOil0 = new OiOliIiOil0(iOoilo);
                        }
                    }
/* 25 */            Object obj = oiOliIiOil0.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oiOliIiOil0.I00iio;
/* 32 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                oOo0lO = new OOo0lO();
/* 61 */                OI110lo oI110lo = OI110lo.I00iOIl;
/* 69 */                I00oO101o i00oO101o = new I00oO101o(oii00o1ll, j, oOo0lO, (IOoil1iiIilo) null, 5);
/* 72 */                oiOliIiOil0.I00iOIl = oii00o1ll;
/* 74 */                oiOliIiOil0.I00iiI = oOo0lO;
/* 76 */                oiOliIiOil0.I00iio = 1;
/* 82 */                if (oii00o1ll.I000II(oI110lo, i00oO101o, oiOliIiOil0) == ii0111o) {
/* 84 */                    return ii0111o;
                        }
/* 85 */                oii00o1ll2 = oii00o1ll;
                    } else {
/* 34 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 36 */                OOo0lO oOo0lO2 = oiOliIiOil0.I00iiI;
/* 38 */                Oii00o1ll oii00o1ll3 = oiOliIiOil0.I00iOIl;
/* 40 */                lIoii1l01l0i.I00000oOI(obj);
/* 43 */                oOo0lO = oOo0lO2;
/* 44 */                oii00o1ll2 = oii00o1ll3;
                    }
/* 92 */            return OIOlIiiioi.I00000oIO(oii00o1ll2.I000OOo1O(oOo0lO.I00iOIl));
                }
            }
