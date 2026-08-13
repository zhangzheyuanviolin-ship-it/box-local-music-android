            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            
            @OII1IiiII("dialog")
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LIii0iOoIo;", "LOII1Il1IlOO;", "LIii0OliiI;", "<init>", "()V", "navigation-compose_release"}, m18k = 1, mv = {2, 0, 0}, xi = 48)
            public final class Iii0iOoIo extends OII1Il1IlOO {
                @Override
                public final OI1ilOI1ioo0 I00000oIO() {
/* 3 */             IOii1l iOii1l = IOilIOIoIl0.I00000oIO;
/* 8 */             Iii0io0OooO iii0io0OooO = new Iii0io0OooO(7);
/* 11 */            Iii0OliiI iii0OliiI = new Iii0OliiI(this);
/* 14 */            iii0OliiI.I00ilO0 = iii0io0OooO;
/* 16 */            iii0OliiI.I00io1l = iOii1l;
/* 18 */            VarHandle.storeStoreFence();
/* 55 */            return iii0OliiI;
                }

                @Override
                public final void I0000O(List list, OI1oooI oI1oooI) {
/* 3 */             Iterator it = list.iterator();
/* 11 */            while (it.hasNext()) {
/* 23 */                I00000oOI().I0000oI00((OI1OloOIO1O) it.next());
                    }
                }

                @Override
                public final void I0000oI00(OI1OloOIO1O oI1OloOIO1O, boolean z) {
/* 5 */             I00000oOI().I0000O(oI1OloOIO1O, z);
/* 22 */            int iI00IO1 = IOOi0Ool1i.I00IO1((Iterable) I00000oOI().I0001Ioi1lo.I00iOIl.getValue(), oI1OloOIO1O);
/* 44 */            int i = 0;
/* 49 */            for (Object obj : (Iterable) I00000oOI().I0001Ioi1lo.I00iOIl.getValue()) {
/* 55 */                int i2 = i + 1;
/* 57 */                if (i < 0) {
/* 72 */                    IOOi1I.I000lI();
/* 76 */                    throw null;
                        }
/* 59 */                OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) obj;
/* 61 */                if (i > iI00IO1) {
/* 67 */                    I00000oOI().I00000oOI(oI1OloOIO1O2);
                        }
/* 70 */                i = i2;
                    }
                }
            }
