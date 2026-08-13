            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.function.Predicate;
            
/* 15 */    public final class Oli1ooI0oi implements Collection, O0IlIoi {
                public final int I00iOIl;
                public Object I00iiI;

                @Override
                public final boolean add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    return ((OI0olI1Oii0I) this.I00iiI).I00000oIO(obj);
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final boolean addAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final void clear() {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    ((OI0olI1Oii0I) this.I00iiI).I00000oOI();
/* 21 */                    return;
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 19 */                    return ((OI0olI1Oii0I) this.I00iiI).I0000Il00O(obj);
                        default:
/* 10 */                    return ((OI10I1IoI0Ol) this.I00iiI).I0000O(obj);
                    }
                }

                @Override
                public final boolean containsAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 49 */                    Iterator it = collection.iterator();
/* 57 */                    while (it.hasNext()) {
/* 71 */                        if (!((OI0olI1Oii0I) this.I00iiI).I0000Il00O(it.next())) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 8 */                     Collection collection2 = collection;
/* 17 */                    if (!collection2.isEmpty()) {
/* 20 */                        Iterator it2 = collection2.iterator();
/* 28 */                        while (it2.hasNext()) {
/* 42 */                            if (!((OI10I1IoI0Ol) this.I00iiI).I0000O(it2.next())) {
                                        break;
                                    }
                                }
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final boolean isEmpty() {
                    switch (this.I00iOIl) {
                        case 0:
                            return ((OI0olI1Oii0I) this.I00iiI).I000II == 0;
                        default:
/* 10 */                    return ((OI10I1IoI0Ol) this.I00iiI).I000OOo1O();
                    }
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    OI0olI1Oii0I oI0olI1Oii0I = (OI0olI1Oii0I) this.I00iiI;
/* 24 */                    OI0oo0o oI0oo0o = new OI0oo0o();
/* 27 */                    oI0oo0o.I00iOIl = oI0olI1Oii0I;
/* 29 */                    oI0oo0o.I00iiI = oI0olI1Oii0I;
/* 31 */                    VarHandle.storeStoreFence();
/* 34 */                    return oI0oo0o.iterator();
                        default:
/* 13 */                    return OilOIIlI.I00000oIO(new Il0l11i(this, null, 3));
                    }
                }

                @Override
                public final boolean remove(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    return ((OI0olI1Oii0I) this.I00iiI).I000II(obj);
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    return ((OI0olI1Oii0I) this.I00iiI).I000II(collection);
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final boolean removeIf(Predicate predicate) {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final boolean retainAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    return ((OI0olI1Oii0I) this.I00iiI).I000OOo1O(collection);
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    return ((OI0olI1Oii0I) this.I00iiI).I000II;
                        default:
/* 10 */                    return ((OI10I1IoI0Ol) this.I00iiI).I0000oI00;
                    }
                }

                @Override
                public final Object[] toArray() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return i1O0Ill0.I00000oIO(this);
                }

                @Override
/* 16 */        public final Object[] toArray(Object[] objArr) {
                    switch (this.I00iOIl) {
                    }
/* 17 */            return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
