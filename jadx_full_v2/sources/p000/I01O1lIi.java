            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            
/* 27 */    public abstract class I01O1lIi implements OOlo0i0, I1110ii00, OlOo0OlIol1l, l1i11I1I0 {
                public Object I00iOIl;

                public I01O1lIi(int i) {
                    switch (i) {
                        case 3:
/* 69 */                    IIOOoll iIOOoll = new IIOOoll(5);
/* 78 */                    iIOOoll.I00iiI = new AtomicReference(null);
/* 80 */                    VarHandle.storeStoreFence();
/* 83 */                    this.I00iOIl = iIOOoll;
                            break;
                        case 4:
                        default:
/* 7 */                     OI0l1oli1I oI0l1oli1I = IooO001.I00000oIO;
/* 14 */                    this.I00iOIl = new OI0l1oli1I();
                            break;
                        case 5:
/* 60 */                    this.I00iOIl = new Object();
                            break;
                        case 6:
/* 34 */                    IO0l0Il0lO0 iO0l0Il0lO0 = new IO0l0Il0lO0();
/* 39 */                    iO0l0Il0lO0.I00iOIl = IO0l0Il0lO0.I00l0I0l0lO1;
/* 43 */                    iO0l0Il0lO0.I00iiI = IO0l0Il0lO0.I00l0OO0IO;
/* 47 */                    iO0l0Il0lO0.I00iio = IO0l0Il0lO0.I00li1OI;
/* 49 */                    this.I00iOIl = iO0l0Il0lO0;
                            break;
                        case 7:
/* 26 */                    this.I00iOIl = lOO00IiI0li.I00000oIO(Boolean.FALSE);
                            break;
                    }
                }

                public static void I00l0I0l0lO1(int i) {
/* 10 */            String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 19 */            Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
/* 24 */            if (i == 1 || i == 2) {
/* 33 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
                    } else {
/* 30 */                objArr[0] = "receiverType";
                    }
/* 35 */            if (i == 1) {
/* 49 */                objArr[1] = "getType";
                    } else if (i != 2) {
/* 39 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
                    } else {
/* 44 */                objArr[1] = "getOriginal";
                    }
/* 51 */            if (i != 1 && i != 2) {
/* 57 */                objArr[2] = "<init>";
                    }
/* 59 */            String str2 = String.format(str, objArr);
/* 63 */            if (i != 1 && i != 2) {
/* 168 */               throw new IllegalArgumentException(str2);
                    }
/* 168 */           throw new IllegalStateException(str2);
                }

                public static void I00l0OO0IO(int i) {
/* 7 */             String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
/* 15 */            Object[] objArr = new Object[i != 1 ? 3 : 2];
/* 20 */            if (i != 1) {
/* 24 */                objArr[0] = "annotations";
                    } else {
/* 27 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
                    }
/* 29 */            if (i != 1) {
/* 31 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
                    } else {
/* 36 */                objArr[1] = "getAnnotations";
                    }
/* 38 */            if (i != 1) {
/* 42 */                objArr[2] = "<init>";
                    }
/* 44 */            String str2 = String.format(str, objArr);
/* 48 */            if (i == 1) {
/* 77 */                throw new IllegalStateException(str2);
                    }
                }

                @Override
                public Set I000II() {
/* 9 */             return Collections.unmodifiableSet(((Map) this.I00iOIl).entrySet());
                }

                @Override
                public lolOiIoiillI I001i1O0Ol() {
/* 20 */            throw null;
                }

                @Override
                public l01O0IO1ooO0 I00II0oii1o() {
/* 20 */            throw null;
                }

                @Override
                public Iioi0lilII I00IoO0() {
/* 20 */            throw null;
                }

                @Override
                public void I00OloOo(String str, Iterable iterable) {
/* 1 */             List listI00oI0i = I00oI0i(str);
/* 5 */             Iterator it = iterable.iterator();
/* 13 */            while (it.hasNext()) {
/* 21 */                I010I0((String) it.next());
                    }
/* 27 */            IOOii0O10Io0.I00100l0(listI00oI0i, iterable);
                }

                @Override
                public l0o10OoO0 I00iOIl() {
/* 20 */            throw null;
                }

                @Override
                public Context I00iiI() {
/* 20 */            throw null;
                }

                public abstract void I00li1OI(O0oiO0ilooli o0oiO0ilooli);

                public void I00ll1(String str, String str2) {
/* 1 */             I010I0(str2);
/* 8 */             I00oI0i(str).add(str2);
                }

                public void I00lli11(Io1IoOi1IOi io1IoOi1IOi) {
/* 4 */             Ol0Oo0 ol0Oo0 = new Ol0Oo0(2);
/* 7 */             ol0Oo0.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            io1IoOi1IOi.I000OOo1O(ol0Oo0);
                }

                public abstract void I00lll10(OlOO1i11110 olOO1i11110);

                public abstract void I00o0iI0io1(Oil1IOoo1lI oil1IOoo1lI);

                public abstract void I00o0l1o1o0();

                public abstract void I00o101lO();

                public List I00oI0i(String str) {
/* 3 */             Map map = (Map) this.I00iOIl;
/* 9 */             List list = (List) map.get(str);
/* 11 */            if (list != null) {
/* 29 */                return list;
                    }
/* 15 */            ArrayList arrayList = new ArrayList();
/* 18 */            I010101Oo1lO(str);
/* 21 */            map.put(str, arrayList);
/* 29 */            return arrayList;
                }

                public String I00oII(String str) {
/* 1 */             List listI00oIiI10 = I00oIiI10(str);
/* 5 */             if (listI00oIiI10 != null) {
/* 11 */                return (String) IOOi0Ool1i.I00II0Ol1O0l(listI00oIiI10);
                    }
/* 14 */            return null;
                }

                public List I00oIiI10(String str) {
/* 9 */             return (List) ((Map) this.I00iOIl).get(str);
                }

                public abstract O0lilO I00oO101o(int i, int i2, int i3, long j);

                public abstract String I00oOio10iI1();

                public abstract O0oOi0I I00ol1();

                public abstract Object I00olI();

                public List I00oli(O0lilI1ioI o0lilI1ioI, int i, long j) {
/* 3 */             OI0l1oli1I oI0l1oli1I = (OI0l1oli1I) this.I00iOIl;
/* 9 */             List list = (List) oI0l1oli1I.I00000oOI(i);
/* 11 */            if (list != null) {
/* 13 */                return list;
                    }
/* 14 */            List listI00000oOI = o0lilI1ioI.I00000oOI(i);
/* 18 */            int size = listI00000oOI.size();
/* 24 */            ArrayList arrayList = new ArrayList(size);
/* 28 */            for (int i2 = 0; i2 < size; i2++) {
/* 40 */                arrayList.add(((O1iIo0ll) listI00000oOI.get(i2)).I001lllioOl(j));
                    }
/* 46 */            oI0l1oli1I.I000OOo1O(i, arrayList);
/* 98 */            return arrayList;
                }

                public abstract Object I00oliIiO01i();

                public abstract Function1 I00oo1iO0ll(Oil1IOoo1lI oil1IOoo1lI);

                public abstract void I00ooIo0(O0oiO0ilooli o0oiO0ilooli);

                public abstract void I00ooiO1I(IO1010 io1010);

                public abstract void I00oooO(Object obj);

                public abstract void I0100i(OoI1Oi0l1I0o ooI1Oi0l1I0o);

                public abstract void I0100o111I();

                public void I010II() {
/* 5 */             l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 7 */             l0olllO1i.I000II(l0o10ooo0);
/* 10 */            l0o10ooo0.I010II();
                }

                @Override
                public I11IlOOO getAnnotations() {
/* 3 */             I11IlOOO i11IlOOO = (I11IlOOO) this.I00iOIl;
/* 5 */             if (i11IlOOO != null) {
/* 7 */                 return i11IlOOO;
                    }
/* 9 */             I00l0OO0IO(1);
/* 20 */            throw null;
                }

                @Override
                public O0iIl1 getType() {
/* 3 */             O0iIl1 o0iIl1 = (O0iIl1) this.I00iOIl;
/* 5 */             if (o0iIl1 != null) {
/* 7 */                 return o0iIl1;
                    }
/* 9 */             I00l0I0l0lO1(1);
/* 20 */            throw null;
                }

/* 28 */        public void I010101Oo1lO(String str) {
                }

/* 28 */        public void I010I0(String str) {
                }

/* 86 */        public I01O1lIi(I11IlOOO i11IlOOO) {
                    if (i11IlOOO != null) {
/* 88 */                this.I00iOIl = i11IlOOO;
                    } else {
/* 89 */                I00l0OO0IO(0);
                        throw null;
                    }
                }

/* 89 */        public I01O1lIi(O0iIl1 o0iIl1) {
                    if (o0iIl1 != null) {
/* 91 */                this.I00iOIl = o0iIl1;
                    } else {
/* 92 */                I00l0I0l0lO1(0);
                        throw null;
                    }
                }

/* 92 */        public I01O1lIi(l0olllO1i l0olllo1i) {
                    lII0I0I000I.I000II(l0olllo1i);
                    this.I00iOIl = l0olllo1i;
                }
            }
