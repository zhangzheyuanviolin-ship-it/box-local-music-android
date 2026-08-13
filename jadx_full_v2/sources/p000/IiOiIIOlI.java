            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.LinkedHashSet;
            
/* 87 */    public final class IiOiIIOlI extends l1il11Il {
                public Il0oiOlO1ooI I00000oIO;
                public LinkedHashSet I00000oOI;
                public boolean I0000Il00O;

                public static void I0000O(int i) {
/* 2 */             Object[] objArr = new Object[3];
/* 8 */             if (i == 1) {
/* 38 */                objArr[0] = "fromSuper";
                    } else if (i == 2) {
/* 33 */                objArr[0] = "fromCurrent";
                    } else if (i == 3) {
/* 28 */                objArr[0] = "member";
                    } else if (i != 4) {
/* 18 */                objArr[0] = "fakeOverride";
                    } else {
/* 23 */                objArr[0] = "overridden";
                    }
/* 42 */            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
/* 44 */            if (i == 1 || i == 2) {
/* 64 */                objArr[2] = "conflict";
                    } else if (i == 3 || i == 4) {
/* 59 */                objArr[2] = "setOverriddenDescriptors";
                    } else {
/* 54 */                objArr[2] = "addFakeOverride";
                    }
/* 186 */           throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }

                @Override
                public final void I00000oIO(IIiO00o1o iIiO00o1o) {
/* 1 */             if (iIiO00o1o == null) {
/* 25 */                I0000O(0);
/* 49 */                throw null;
                    }
/* 7 */             I00iiI i00iiI = new I00iiI(15);
/* 10 */            i00iiI.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            OIlIlOllioi.I0010I0i(iIiO00o1o, i00iiI);
/* 20 */            this.I00000oOI.add(iIiO00o1o);
                }

                @Override
                public final void I0000Il00O(IIiO00o1o iIiO00o1o, Collection collection) {
/* 1 */             if (iIiO00o1o == null) {
/* 20 */                I0000O(3);
/* 89 */                throw null;
                    }
/* 5 */             if (!this.I0000Il00O || iIiO00o1o.I000oI1ioi() == 2) {
/* 15 */                iIiO00o1o.I00iIi0i1o(collection);
                    }
                }

                @Override
/* 88 */        public final void I00000oOI(IIiO00o1o iIiO00o1o, IIiO00o1o iIiO00o1o2) {
                }
            }
