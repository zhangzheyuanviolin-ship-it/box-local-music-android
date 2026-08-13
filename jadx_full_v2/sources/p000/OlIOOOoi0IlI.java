            package p000;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            
/* 84 */    public final class OlIOOOoi0IlI {
                public final ArrayList I00000oIO;

                public OlIOOOoi0IlI(OillOo0 oillOo0) {
/* 1 */             int i = i01I01lIOo.I00000oIO;
/* 10 */            I1ool0o i1ool0o = new I1ool0o((I1oolIoOllO) oillOo0.I00iiO, 0);
/* 13 */            VarHandle.storeStoreFence();
/* 23 */            I1ool0o i1ool0o2 = new I1ool0o((I1oolIoOllO) oillOo0.I00iio, 1);
/* 26 */            VarHandle.storeStoreFence();
/* 36 */            I1ool0o i1ool0o3 = new I1ool0o((I1oolIoOllO) oillOo0.I00ilI0I1, 2);
/* 39 */            VarHandle.storeStoreFence();
/* 51 */            ArrayList arrayListI000OiO = IOOi1I.I000OiO(i1ool0o, i1ool0o2, i1ool0o3);
/* 65 */            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) oillOo0.I00iiI).getSystemService("connectivity");
/* 69 */            OIIOiO00i1i oIIOiO00i1i = new OIIOiO00i1i();
/* 72 */            oIIOiO00i1i.I00000oIO = connectivityManager;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            arrayListI000OiO.add(oIIOiO00i1i);
/* 83 */            this.I00000oIO = arrayListI000OiO;
                }

                public void I00000oIO(Object obj) {
/* 3 */             this.I00000oIO.add(obj);
                }

                public void I00000oOI(Object obj) {
/* 1 */             if (obj == null) {
/* 82 */                return;
                    }
/* 4 */             boolean z = obj instanceof Object[];
/* 6 */             ArrayList arrayList = this.I00000oIO;
/* 8 */             if (z) {
/* 10 */                Object[] objArr = (Object[]) obj;
/* 13 */                if (objArr.length > 0) {
/* 21 */                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
/* 24 */                    Collections.addAll(arrayList, objArr);
/* 27 */                    return;
                        }
/* 82 */                return;
                    }
/* 30 */            if (obj instanceof Collection) {
/* 34 */                arrayList.addAll((Collection) obj);
/* 37 */                return;
                    }
/* 40 */            if (obj instanceof Iterable) {
/* 44 */                Iterator it = ((Iterable) obj).iterator();
/* 52 */                while (it.hasNext()) {
/* 58 */                    arrayList.add(it.next());
                        }
                    } else if (obj instanceof Iterator) {
/* 66 */                Iterator it2 = (Iterator) obj;
/* 72 */                while (it2.hasNext()) {
/* 78 */                    arrayList.add(it2.next());
                        }
                    } else {
/* 168 */               throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
                    }
                }

/* 85 */        public OlIOOOoi0IlI(int i) {
/* 87 */            this.I00000oIO = new ArrayList(i);
                }
            }
