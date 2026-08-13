            package p000;

            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.util.Range;
            import android.util.Size;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Io1iOil0oli {
                public static final Range I0001Ioi1lo = new Range(120, 120);
                public IIlo0i0ll I00000oIO;
                public OllO00oiil I00000oOI;
                public OllO00oiil I0000Il00O;
                public OllO00oiil I0000O;
                public OllO00oiil I0000oI00;

                public static List I00000oIO(List list) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return Il01100l.I00iOIl;
                    }
/* 18 */            ArrayList arrayList = new ArrayList((Collection) IOOi0Ool1i.I001lllioOl(list));
/* 30 */            Iterator it = IOOi0Ool1i.I001iOo1i0O(list, 1).iterator();
/* 38 */            while (it.hasNext()) {
/* 48 */                arrayList.retainAll((List) it.next());
                    }
/* 77 */            return arrayList;
                }

                public final Range[] I00000oOI(List list) {
/* 1 */             int size = list.size();
/* 7 */             if (1 <= size && size < 3 && IOOi0Ool1i.I001i1lo1io(list).size() == 1) {
/* 33 */                List listI0000Il00O = I0000Il00O((Size) list.get(0));
/* 44 */                if (listI0000Il00O.isEmpty()) {
/* 47 */                    listI0000Il00O = null;
                        }
/* 48 */                if (listI0000Il00O != null) {
/* 56 */                    if (list.size() == 2) {
/* 62 */                        ArrayList arrayList = new ArrayList();
/* 73 */                        for (Object obj : listI0000Il00O) {
/* 80 */                            Range range = (Range) obj;
/* 94 */                            if (O0000Ioio00.I0000O(range.getLower(), range.getUpper())) {
/* 96 */                                arrayList.add(obj);
                                    }
                                }
/* 100 */                       listI0000Il00O = arrayList;
                            }
/* 109 */                   return (Range[]) listI0000Il00O.toArray(new Range[0]);
                        }
                    }
/* 5 */             return null;
                }

                public final List I0000Il00O(Size size) {
                    Object objI00000oIO;
                    try {
/* 14 */                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((OlOIOo0) this.I0000O.getValue()).I0000Il00O.I00iOIl;
/* 23 */                objI00000oIO = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
                    } catch (Throwable th) {
/* 26 */                objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 36 */            Range[] rangeArr = (Range[]) (objI00000oIO instanceof Oi10Ii1i1lo ? null : objI00000oIO);
                    return rangeArr != null ? IOOi0Ool1i.I00iIi0i1o(I1IoiO1l.I001IIilI0O(rangeArr)) : Il01100l.I00iOIl;
                }
            }
