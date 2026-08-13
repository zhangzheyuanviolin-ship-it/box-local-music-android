            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lO1i1O {
                public static final OiOilOo0io I00000oIO(int i, ArrayList arrayList) {
/* 1 */             int size = arrayList.size();
/* 6 */             for (int i2 = 0; i2 < size; i2++) {
/* 16 */                if (((OiOilOo0io) arrayList.get(i2)).I00iOIl == i) {
/* 22 */                    return (OiOilOo0io) arrayList.get(i2);
                        }
                    }
/* 28 */            return null;
                }

                public static final Oo0iil0o0oI I00000oOI(OiioiIIlooo oiioiIIlooo) {
                    Function1 function1;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 10 */            Object objI000II = oiioiIIlooo.I00iOIl.I000II(Oiioi1IoIIli.I00000oIO);
/* 15 */            if (objI000II == null) {
/* 17 */                objI000II = null;
                    }
/* 18 */            I01lOOlO0o i01lOOlO0o = (I01lOOlO0o) objI000II;
/* 20 */            if (i01lOOlO0o == null || (function1 = (Function1) i01lOOlO0o.I00000oOI) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
/* 14 */                return null;
                    }
/* 45 */            return (Oo0iil0o0oI) arrayList.get(0);
                }

                public static final I10I1li0 I0000Il00O(I10OIIo i10OIIo, int i) {
                    Object next;
/* 11 */            Iterator<T> it = i10OIIo.getLayoutNodeToHolder().entrySet().iterator();
                    while (true) {
/* 20 */                if (!it.hasNext()) {
/* 40 */                    next = null;
                            break;
                        }
/* 22 */                next = it.next();
/* 37 */                if (((O0iiOioolIi) ((Map.Entry) next).getKey()).I00iiI == i) {
                            break;
                        }
                    }
/* 41 */            Map.Entry entry = (Map.Entry) next;
/* 43 */            if (entry != null) {
/* 49 */                return (I10I1li0) entry.getValue();
                    }
/* 19 */            return null;
                }

                public static final String I0000O(int i) {
/* 1 */             if (i == 0) {
/* 3 */                 return "android.widget.Button";
                    }
/* 7 */             if (i == 1) {
/* 9 */                 return "android.widget.CheckBox";
                    }
/* 13 */            if (i == 3) {
/* 15 */                return "android.widget.RadioButton";
                    }
/* 19 */            if (i == 5) {
/* 21 */                return "android.widget.ImageView";
                    }
/* 25 */            if (i == 6) {
/* 27 */                return "android.widget.Spinner";
                    }
/* 31 */            if (i == 7) {
/* 33 */                return "android.widget.NumberPicker";
                    }
/* 36 */            return null;
                }
            }
