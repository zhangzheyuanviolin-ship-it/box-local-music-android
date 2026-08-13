            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class OIo0liIiiOlI implements OIo0loI111I1 {
                public ArrayList I00000oIO;

                @Override
                public final boolean I00000oIO(Ill0IO ill0IO) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 7 */             if (arrayList.isEmpty()) {
/* 38 */                return true;
                    }
/* 10 */            Iterator it = arrayList.iterator();
/* 18 */            while (it.hasNext()) {
/* 34 */                if (O0000Ioio00.I0000O(((OIo0l0) ((OIo0il) it.next())).I00ilI0I1, ill0IO)) {
/* 36 */                    return false;
                        }
                    }
/* 38 */            return true;
                }

                @Override
                public final void I00000oOI(Ill0IO ill0IO, ArrayList arrayList) {
/* 11 */            for (Object obj : this.I00000oIO) {
/* 28 */                if (O0000Ioio00.I0000O(((OIo0l0) ((OIo0il) obj)).I00ilI0I1, ill0IO)) {
/* 30 */                    arrayList.add(obj);
                        }
                    }
                }

                @Override
                public final Collection I000O01llI0(Ill0IO ill0IO, Function1 function1) {
/* 11 */            OoI10o0iO11O ooI10o0iO11O = new OoI10o0iO11O(IOOi0Ool1i.I001IO000(this.I00000oIO), IiOi0I1.I00ooIo0);
/* 17 */            IOl1Il0l iOl1Il0l = new IOl1Il0l(1);
/* 20 */            iOl1Il0l.I00iiI = ill0IO;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            return OilO1oiooiII.I000lI(OilO1oiooiII.I0001Ioi1lo(ooI10o0iO11O, iOl1Il0l));
                }
            }
