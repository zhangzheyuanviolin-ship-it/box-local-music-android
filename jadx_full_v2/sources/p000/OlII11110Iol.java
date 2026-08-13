            package p000;

            import android.text.TextUtils;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OlII11110Iol implements OliiillO {
                public ArrayList I00iOIl = new ArrayList();

                public String I00000oIO() {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 5 */             StringBuilder sb = new StringBuilder();
/* 13 */            for (int i = 0; i < arrayList.size(); i++) {
/* 15 */                if (i != 0) {
/* 19 */                    sb.append('\n');
                        }
/* 30 */                sb.append(((OlII0Io1) arrayList.get(i)).I00000oIO);
                    }
/* 36 */            return sb.toString();
                }

                public ArrayList I00000oOI() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = this.I00iOIl.iterator();
/* 16 */            while (it.hasNext()) {
/* 24 */                OlIIOI0o olIIOI0o = ((OlII0Io1) it.next()).I00000oOI;
/* 26 */                if (olIIOI0o != null) {
/* 28 */                    arrayList.add(olIIOI0o);
                        }
                    }
/* 55 */            return arrayList;
                }

                @Override
                public Object get() {
/* 1 */             Object obj = lIlIo1.I000OiO;
/* 5 */             ArrayList arrayList = this.I00iOIl;
/* 7 */             List list = Collections.EMPTY_LIST;
/* 9 */             lloOo1iol llooo1iol = new lloOo1iol();
/* 17 */            llooo1iol.I00000oIO = new HashMap();
/* 24 */            llooo1iol.I00000oOI = new HashMap();
/* 31 */            llooo1iol.I0000Il00O = new ArrayList();
/* 33 */            Iterator it = arrayList.iterator();
/* 41 */            while (it.hasNext()) {
/* 47 */                loIo0iiOoi loio0iiooi = (loIo0iiOoi) it.next();
/* 57 */                if (TextUtils.isEmpty(loio0iiooi.zzc())) {
/* 63 */                    Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
                        } else {
/* 77 */                    loIo0iiOoi loio0iiooi2 = (loIo0iiOoi) llooo1iol.I00000oIO.put(loio0iiooi.zzc(), loio0iiooi);
/* 79 */                    if (loio0iiooi2 != null) {
/* 86 */                        String canonicalName = loio0iiooi2.getClass().getCanonicalName();
/* 94 */                        String canonicalName2 = loio0iiooi.getClass().getCanonicalName();
/* 130 */                       I000II.I000iOII(IIl001iO0Io.I00100o1O0lo(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
/* 133 */                       return null;
                            }
                        }
                    }
/* 135 */           Iterator it2 = list.iterator();
/* 143 */           if (it2.hasNext()) {
/* 245 */               throw IIlIOloOOO.I000lI(it2);
                    }
/* 147 */           llooo1iol.I0000Il00O.addAll(list);
/* 150 */           VarHandle.storeStoreFence();
/* 153 */           return llooo1iol;
                }
            }
