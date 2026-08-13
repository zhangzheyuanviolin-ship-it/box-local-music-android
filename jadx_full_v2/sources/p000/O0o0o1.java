            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class O0o0o1 implements IllOOo00lI {
                public final int I00iOIl;
                public O0o0oOii I00iiI;

                public O0o0o1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O0o0oOii o0o0oOii = this.I00iiI;
                    switch (i) {
                        case 0:
/* 153 */                   OI0011 oi0011 = o0o0oOii.I00iiO;
/* 155 */                   oi0011.I010i10l();
/* 164 */                   IOl1o0IioiI0 iOl1o0IioiI0 = (IOl1o0IioiI0) oi0011.I00li1OI.getValue();
/* 166 */                   Ill0IO ill0IO = o0o0oOii.I00iio;
/* 170 */                   ArrayList arrayList = new ArrayList();
/* 173 */                   iOl1o0IioiI0.I00000oOI(ill0IO, arrayList);
/* 176 */                   return arrayList;
                        case 1:
/* 129 */                   OI0011 oi00112 = o0o0oOii.I00iiO;
/* 131 */                   oi00112.I010i10l();
/* 148 */                   return Boolean.valueOf(((IOl1o0IioiI0) oi00112.I00li1OI.getValue()).I00000oIO(o0o0oOii.I00iio));
                        default:
/* 8 */                     O1I0II11i o1I0II11i = o0o0oOii.I00ilO0;
/* 10 */                    O0O00I1Ili[] o0O00I1IliArr = O0o0oOii.I00ioIO;
/* 13 */                    O0O00I1Ili o0O00I1Ili = o0O00I1IliArr[1];
/* 21 */                    boolean zBooleanValue = ((Boolean) o1I0II11i.invoke()).booleanValue();
/* 25 */                    Ill0IO ill0IO2 = o0o0oOii.I00iio;
/* 27 */                    OI0011 oi00113 = o0o0oOii.I00iiO;
/* 29 */                    if (zBooleanValue) {
/* 31 */                        return O1iii1olO.I00000oOI;
                            }
/* 34 */                    O1I0II11i o1I0II11i2 = o0o0oOii.I00ilI0I1;
/* 37 */                    O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr[0];
/* 43 */                    List list = (List) o1I0II11i2.invoke();
/* 55 */                    ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list, 10));
/* 58 */                    Iterator it = list.iterator();
/* 66 */                    while (it.hasNext()) {
/* 78 */                        arrayList2.add(((OIo0il) it.next()).I00IoiI());
                            }
/* 84 */                    OliII1IIo oliII1IIo = new OliII1IIo();
/* 87 */                    oliII1IIo.I00000oOI = oi00113;
/* 89 */                    oliII1IIo.I0000Il00O = ill0IO2;
/* 91 */                    VarHandle.storeStoreFence();
/* 124 */                   return iOl1Oi.I00000oIO("package view scope for " + ill0IO2 + " in " + oi00113.getName(), IOOi0Ool1i.I00OI1(arrayList2, oliII1IIo));
                    }
                }
            }
