            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.Type;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 8 */     public final class IiO11010IiO extends IiO10i1 implements Illl0OO0l, IllOOo00lI, Function1, IllOiOo, IllOii1Oi0O0, IllOlI00O, IllOlIollo, IllOlO0oo, IllOli, IllOll1, IllOlo, IllOlo0i10, IllOo0, IlliIl1l11O, Illi01O0, Illi11O0I, Illi1lO0, Function3, IlliOIilI, IlliOIo0o10, IlliOll, Illiioi1, Illil0Iio, Illil0o1o, O0IOl1llI1I, O0Iill {
                public static final O0O00I1Ili[] I00lll10 = {OOoOl0i.I00000oIO.I000O01llI0(new OOOOIO0i(IiO11010IiO.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};
                public final O0IiOio0lo0 I00ioIO;
                public final String I00l0I0l0lO1;
                public final Object I00l0OO0IO;
                public final OOoOiOo01lo I00li1OI;
                public final O0ioIllo0i1 I00ll1;
                public final O0ioIllo0i1 I00lli11;

                public IiO11010IiO(O0IiOio0lo0 o0IiOio0lo0, String str, String str2, Illlil illlil, Object obj) {
/* 4 */             this.I00ioIO = o0IiOio0lo0;
/* 6 */             this.I00l0I0l0lO1 = str2;
/* 8 */             this.I00l0OO0IO = obj;
/* 14 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(10);
/* 17 */            i01illiil1Oo.I00iiO = this;
/* 19 */            i01illiil1Oo.I00iiI = str;
/* 21 */            VarHandle.storeStoreFence();
/* 28 */            this.I00li1OI = lIlo0Oi0oOI.I00000oIO(illlil, i01illiil1Oo);
/* 30 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 35 */            IiO10l iiO10l = new IiO10l(0);
/* 38 */            iiO10l.I00iiI = this;
/* 40 */            VarHandle.storeStoreFence();
/* 47 */            this.I00ll1 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, iiO10l);
/* 52 */            IiO10l iiO10l2 = new IiO10l(1);
/* 55 */            iiO10l2.I00iiI = this;
/* 57 */            VarHandle.storeStoreFence();
/* 64 */            this.I00lli11 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, iiO10l2);
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
/* 5 */             return I0000O(obj, obj2, obj3, obj4);
                }

                @Override
                public final boolean I00100l0() {
/* 5 */             return I001lloI().I00100l0();
                }

                @Override
                public final Object I00100o1O0lo(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, IloI0lOlll1 iloI0lOlll1, Integer num) {
/* 14 */            return I0000O(O1ooIo101ll.I00000oIO, obj, bool, obj2, obj3, obj4, iloI0lOlll1, num);
                }

                @Override
                public final Object I0010I0i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
/* 5 */             return I0000O(obj, obj2, obj3, obj4, obj5);
                }

                @Override
                public final IIiOlII I001l0I00() {
/* 7 */             return (IIiOlII) this.I00ll1.getValue();
                }

                @Override
                public final O0IiOio0lo0 I001lIiIIo1O() {
/* 1 */             return this.I00ioIO;
                }

                @Override
                public final IIiOlII I001lllioOl() {
/* 7 */             return (IIiOlII) this.I00lli11.getValue();
                }

                @Override
                public final Object I00II0oii1o() {
/* 1 */             return this.I00l0OO0IO;
                }

                public final IIil1l I00IO1oi11O(Constructor constructor, Illlil illlil, boolean z) {
/* 1 */             Object obj = this.I00l0OO0IO;
/* 4 */             if (!z) {
/* 13 */                IOIO10lo iOIO10lo = illlil instanceof IOIO10lo ? (IOIO10lo) illlil : null;
/* 14 */                if (iOIO10lo != null && !IiOiioI.I0000oI00(iOIO10lo.I000OiO()) && !Ioll0il1OI.I0000oI00(iOIO10lo.I001l0I00()) && !IiOiIO0i1Oil.I000oI1ioi(iOIO10lo.I001l0I00())) {
/* 54 */                    List listI00Iooi00oi = iOIO10lo.I00Iooi00oi();
/* 62 */                    if (!(listI00Iooi00oi instanceof Collection) || !listI00Iooi00oi.isEmpty()) {
/* 75 */                        Iterator it = listI00Iooi00oi.iterator();
/* 83 */                        while (it.hasNext()) {
/* 99 */                            if (iolo01.I00000oIO(((Ooo00oi0O) it.next()).getType())) {
/* 107 */                               if (!lIll0lII1.I00000oIO(this)) {
/* 159 */                                   Class declaringClass = constructor.getDeclaringClass();
/* 163 */                                   Type[] genericParameterTypes = constructor.getGenericParameterTypes();
/* 183 */                                   return new IIiOll(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : I1IoiO1l.I00100o1O0lo(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                        }
/* 116 */                               Object objI00000oIO = li1O10Oli1i1.I00000oIO(obj, I001lloI());
/* 120 */                               Class declaringClass2 = constructor.getDeclaringClass();
/* 124 */                               Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
/* 146 */                               IIiOli0i0llI iIiOli0i0llI = new IIiOli0i0llI(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : I1IoiO1l.I00100o1O0lo(genericParameterTypes2, 1, genericParameterTypes2.length - 1)), 0);
/* 149 */                               iIiOli0i0llI.I0001Ioi1lo = objI00000oIO;
/* 151 */                               VarHandle.storeStoreFence();
/* 154 */                               return iIiOli0i0llI;
                                    }
                                }
                            }
                        }
                    }
/* 192 */           if (!lIll0lII1.I00000oIO(this)) {
/* 225 */               Class declaringClass3 = constructor.getDeclaringClass();
/* 229 */               Class declaringClass4 = constructor.getDeclaringClass();
/* 233 */               Class<?> declaringClass5 = declaringClass4.getDeclaringClass();
/* 259 */               return new IIiOll(constructor, declaringClass3, (declaringClass5 == null || Modifier.isStatic(declaringClass4.getModifiers())) ? null : declaringClass5, constructor.getGenericParameterTypes(), 1);
                    }
/* 200 */           Object objI00000oIO2 = li1O10Oli1i1.I00000oIO(obj, I001lloI());
/* 213 */           IIiOli0i0llI iIiOli0i0llI2 = new IIiOli0i0llI(constructor, constructor.getDeclaringClass(), null, constructor.getGenericParameterTypes(), 1);
/* 216 */           iIiOli0i0llI2.I0001Ioi1lo = objI00000oIO2;
/* 218 */           VarHandle.storeStoreFence();
/* 221 */           return iIiOli0i0llI2;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIiiOiO1 I00IOO(Method method, boolean z) {
                    Class cls;
/* 5 */             if (!lIll0lII1.I00000oIO(this)) {
/* 80 */                return new IIil1I01iI(method, 2);
                    }
/* 13 */            O0ioOi0Oo1ii o0ioOi0Oo1iiI00OI1 = I001lloI().I00OI1();
/* 17 */            Object objI00000oIO = this.I00l0OO0IO;
/* 19 */            if (o0ioOi0Oo1iiI00OI1 != null) {
/* 21 */                O0iIl1 type = o0ioOi0Oo1iiI00OI1.getType();
/* 25 */                int i = Ioll0il1OI.I00000oIO;
/* 31 */                IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = type.I00iOIl().I00100o1O0lo();
/* 44 */                if (!(iOIiO1lIl0lI00100o1O0lo != null ? Ioll0il1OI.I00000oOI(iOIiO1lIl0lI00100o1O0lo) : false) || (cls = (Class) I1IoiO1l.I001i1O0Ol(method.getParameterTypes())) == null || !cls.isInterface()) {
/* 69 */                    objI00000oIO = li1O10Oli1i1.I00000oIO(objI00000oIO, I001lloI());
                        }
                    }
/* 73 */            return new IIiio1(method, z, objI00000oIO);
                }

                @Override
                public final Illlil I001lloI() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I00lll10[0];
/* 12 */            return (Illlil) this.I00li1OI.invoke();
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    IiO11010IiO iiO11010IiO;
/* 1 */             Ill0IO ill0IO = Oolli0oi0.I00000oIO;
/* 5 */             if (obj instanceof IiO11010IiO) {
/* 7 */                 iiO11010IiO = (IiO11010IiO) obj;
                    } else if (obj instanceof IlllollI) {
/* 17 */                O0IOl1llI1I o0IOl1llI1II0000O = ((IlllollI) obj).I0000O();
/* 28 */                iiO11010IiO = o0IOl1llI1II0000O instanceof IiO11010IiO ? (IiO11010IiO) o0IOl1llI1II0000O : null;
                    }
                    return iiO11010IiO != null && O0000Ioio00.I0000O(this.I00ioIO, iiO11010IiO.I00ioIO) && getName().equals(iiO11010IiO.getName()) && O0000Ioio00.I0000O(this.I00l0I0l0lO1, iiO11010IiO.I00l0I0l0lO1) && O0000Ioio00.I0000O(this.I00l0OO0IO, iiO11010IiO.I00l0OO0IO);
                }

                @Override
                public final int getArity() {
/* 5 */             return iOil0li.I00000oIO(I001l0I00());
                }

                @Override
                public final String getName() {
/* 11 */            return ((Ii1Ooli) I001lloI()).getName().I00000oOI();
                }

                public final int hashCode() {
/* 26 */            return this.I00l0I0l0lO1.hashCode() + ((getName().hashCode() + (this.I00ioIO.hashCode() * 31)) * 31);
                }

                @Override
                public final Object invoke(Object obj) {
/* 5 */             return I0000O(obj);
                }

                public final String toString() throws IOException {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             Io1Oioii1111.I0001Ioi1lo(sb, this);
/* 11 */            sb.append("fun ");
/* 14 */            Io1Oioii1111.I000O01llI0(sb, this);
/* 21 */            Io1Oioii1111.I000II(sb, getName());
/* 38 */            IOOi0Ool1i.I00IioO0OiOi(l0OoioOl1l0.I00000oIO(this), sb, ", ", "(", ")", OOo1l011.I00ilI0I1, 48);
/* 43 */            sb.append(": ");
/* 55 */            sb.append(Io1Oioii1111.I000lI(I0001Ioi1lo(), false));
/* 58 */            return sb.toString();
                }

                @Override
/* 9 */         public final Object invoke() {
/* 10 */            return I0000O(new Object[0]);
                }

                @Override
/* 10 */        public final Object invoke(Object obj, Object obj2) {
/* 11 */            return I0000O(obj, obj2);
                }

                @Override
/* 11 */        public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 12 */            return I0000O(obj, obj2, obj3);
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 66 */        public IiO11010IiO(O0IiOio0lo0 o0IiOio0lo0, Illlil illlil) {
/* 70 */            this(o0IiOio0lo0, ((Ii1Ooli) illlil).getName().I00000oOI(), OiII0lO1i1.I0000Il00O(illlil).I00000oIO(), illlil, IIiO01.I00iiI);
                }
            }
