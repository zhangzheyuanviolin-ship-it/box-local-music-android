            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
/* 10 */    public final class I11Io0oil0i0 implements I11IlOOO {
                public final int I00iOIl;
                public Object I00iiI;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public I11Io0oil0i0(I11IlOOO[] i11IlOOOArr) {
/* 8 */             this(I1IoiO1l.I00IioO0OiOi(i11IlOOOArr), 1);
/* 2 */             this.I00iOIl = 1;
                }

                @Override
                public final boolean I001l0I00(Ill0IO ill0IO) {
                    switch (this.I00iOIl) {
                        case 0:
/* 58 */                    if (I00IOO(ill0IO) != null) {
                                break;
                            }
                            break;
                        case 1:
/* 30 */                    Iterator it = ((Iterable) IOOi0Ool1i.I001IO000((List) this.I00iiI).I00000oOI).iterator();
/* 38 */                    while (it.hasNext()) {
/* 50 */                        if (((I11IlOOO) it.next()).I001l0I00(ill0IO)) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 12 */                    if (I00IOO(ill0IO) != null) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final I111oOiIiO0 I00IOO(Ill0IO ill0IO) {
/* 3 */             Object obj = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 64 */                    Iterator it = iterator();
                            while (true) {
/* 72 */                        if (it.hasNext()) {
/* 74 */                            Object next = it.next();
/* 89 */                            if (O0000Ioio00.I0000O(((I111oOiIiO0) next).I0010o(), ill0IO)) {
/* 91 */                                obj = next;
                                    }
                                }
                            }
/* 92 */                    return (I111oOiIiO0) obj;
                        case 1:
/* 26 */                    I1Iolliil0i i1Iolliil0iI001IO000 = IOOi0Ool1i.I001IO000((List) this.I00iiI);
/* 33 */                    IOl1Il0l iOl1Il0l = new IOl1Il0l(0);
/* 36 */                    iOl1Il0l.I00iiI = ill0IO;
/* 38 */                    VarHandle.storeStoreFence();
/* 61 */                    return (I111oOiIiO0) OilO1oiooiII.I000II(new IlIo0o(new OoI10o0iO11O(i1Iolliil0iI001IO000, iOl1Il0l), false, new OiioI1Io0o(4)));
                        default:
/* 15 */                    if (ill0IO.equals((Ill0IO) this.I00iiI)) {
/* 17 */                        return Il0Oll00IOi.I00000oIO;
                            }
/* 3 */                     return null;
                    }
                }

                @Override
                public final boolean isEmpty() {
                    switch (this.I00iOIl) {
                        case 0:
/* 57 */                    return ((List) this.I00iiI).isEmpty();
                        case 1:
/* 10 */                    List list = (List) this.I00iiI;
/* 16 */                    if (!(list instanceof Collection) || !list.isEmpty()) {
/* 28 */                        Iterator it = list.iterator();
/* 36 */                        while (it.hasNext()) {
/* 48 */                            if (!((I11IlOOO) it.next()).isEmpty()) {
/* 3 */                                 return false;
                                    }
                                }
                            }
/* 51 */                    return true;
                        default:
/* 3 */                     return false;
                    }
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00iOIl) {
                        case 0:
/* 37 */                    return ((List) this.I00iiI).iterator();
                        case 1:
/* 28 */                    return new IlOIIioI1(IOOi0Ool1i.I001IO000((List) this.I00iiI), I0ollliOo0.I00oIiI10, OilOOl1Oo00.I00ioIO).iterator();
                        default:
/* 6 */                     return Il010loii1OO.I00iOIl;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    return ((List) this.I00iiI).toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 11 */        public I11Io0oil0i0(Object obj, int i) {
/* 12 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                }

/* 12 */        public I11Io0oil0i0() {
/* 13 */            this.I00iOIl = 0;
                }
            }
