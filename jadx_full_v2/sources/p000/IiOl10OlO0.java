            package p000;

            import java.util.AbstractCollection;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.Map;
            
/* 87 */    public final class IiOl10OlO0 extends l1il11Il {
                public final int I00000oIO;
                public AbstractCollection I00000oOI;

                public IiOl10OlO0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void I00000oIO(IIiO00o1o iIiO00o1o) {
                    switch (this.I00000oIO) {
                        case 0:
/* 50 */                    OIlIlOllioi.I0010I0i(iIiO00o1o, null);
/* 57 */                    ((ArrayList) this.I00000oOI).add(iIiO00o1o);
/* 60 */                    return;
                        default:
/* 7 */                     if (iIiO00o1o == null) {
/* 49 */                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "fakeOverride", "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4", "addFakeOverride"));
                            }
/* 9 */                     OIlIlOllioi.I0010I0i(iIiO00o1o, null);
/* 16 */                    ((LinkedHashSet) this.I00000oOI).add(iIiO00o1o);
/* 19 */                    return;
                    }
                }

                @Override
                public final void I00000oOI(IIiO00o1o iIiO00o1o, IIiO00o1o iIiO00o1o2) {
                    switch (this.I00000oIO) {
                        case 0:
/* 9 */                     if (iIiO00o1o2 instanceof Illll0i) {
/* 11 */                        Illll0i illll0i = (Illll0i) iIiO00o1o2;
/* 13 */                        Map linkedHashMap = illll0i.I00ooiO1I;
/* 15 */                        if (linkedHashMap == null) {
/* 19 */                            linkedHashMap = new LinkedHashMap();
/* 22 */                            illll0i.I00ooiO1I = linkedHashMap;
                                }
/* 26 */                        linkedHashMap.put(IiOlOI0o.I00000oIO, iIiO00o1o);
                                break;
                            }
                            break;
                    }
                }

/* 88 */        private final void I0000O(IIiO00o1o iIiO00o1o, IIiO00o1o iIiO00o1o2) {
                }
            }
