            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Type;
            import java.util.Arrays;
            import java.util.List;
            
            public final class IiO1l1i implements O0IooIIl00 {
                public static final O0O00I1Ili[] I00ilO0;
                public final IiO10i1 I00iOIl;
                public final int I00iiI;
                public final O0Ioo0o I00iiO;
                public final OOoOiOo01lo I00iio;
                public final OOoOiOo01lo I00ilI0I1;

                static {
/* 10 */            OOOOIO0i oOOOIO0i = new OOOOIO0i(IiO1l1i.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
/* 13 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 35 */            I00ilO0 = new O0O00I1Ili[]{oOoOl1001II.I000O01llI0(oOOOIO0i), IIl001iO0Io.I0001Ioi1lo(IiO1l1i.class, "annotations", "getAnnotations()Ljava/util/List;", 0, oOoOl1001II)};
                }

                public IiO1l1i(IiO10i1 iiO10i1, int i, O0Ioo0o o0Ioo0o, IllOOo00lI illOOo00lI) {
/* 4 */             this.I00iOIl = iiO10i1;
/* 6 */             this.I00iiI = i;
/* 8 */             this.I00iiO = o0Ioo0o;
/* 15 */            this.I00iio = lIlo0Oi0oOI.I00000oIO(null, illOOo00lI);
/* 20 */            IiO1io0 iiO1io0 = new IiO1io0(0);
/* 23 */            iiO1io0.I00iiI = this;
/* 25 */            VarHandle.storeStoreFence();
/* 32 */            this.I00ilI0I1 = lIlo0Oi0oOI.I00000oIO(null, iiO1io0);
                }

                public static Type I00000oIO(Type... typeArr) {
/* 1 */             int length = typeArr.length;
/* 2 */             if (length == 0) {
/* 49 */                throw new Ii01OOool("Expected at least 1 type for compound type");
                    }
/* 5 */             if (length == 1) {
/* 28 */                return (Type) I1IoiO1l.I00II0oii1o(typeArr);
                    }
/* 9 */             IiO1l0Oi iiO1l0Oi = new IiO1l0Oi();
/* 12 */            iiO1l0Oi.I00iOIl = typeArr;
/* 18 */            iiO1l0Oi.I00iiI = Arrays.hashCode(typeArr);
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            return iiO1l0Oi;
                }

                public final OIoioOli1I I0000O() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I00ilO0[0];
/* 12 */            return (OIoioOli1I) this.I00iio.invoke();
                }

                public final IiOOIlll I000l1() {
/* 7 */             O0iIl1 type = I0000O().getType();
/* 14 */            IiO1io0 iiO1io0 = new IiO1io0(1);
/* 17 */            iiO1io0.I00iiI = this;
/* 19 */            VarHandle.storeStoreFence();
/* 23 */            return new IiOOIlll(type, iiO1io0, false);
                }

                public final boolean I00100o1O0lo() {
/* 1 */             OIoioOli1I oIoioOli1II0000O = I0000O();
/* 12 */            Ooo00oi0O ooo00oi0O = oIoioOli1II0000O instanceof Ooo00oi0O ? (Ooo00oi0O) oIoioOli1II0000O : null;
/* 13 */            if (ooo00oi0O != null) {
/* 15 */                return IiOiOOIo.I00000oIO(ooo00oi0O);
                    }
/* 20 */            return false;
                }

                public final boolean I0010I0i() {
/* 1 */             OIoioOli1I oIoioOli1II0000O = I0000O();
                    return (oIoioOli1II0000O instanceof Ooo00oi0O) && ((Ooo00oi0O) oIoioOli1II0000O).I00l0OO0IO != null;
                }

                @Override
                public final List I001iOo1i0O() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I00ilO0[1];
/* 12 */            return (List) this.I00ilI0I1.invoke();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IiO1l1i)) {
/* 25 */                return false;
                    }
/* 5 */             IiO1l1i iiO1l1i = (IiO1l1i) obj;
                    return this.I00iOIl.equals(iiO1l1i.I00iOIl) && this.I00iiI == iiO1l1i.I00iiI;
                }

                public final String getName() {
/* 1 */             OIoioOli1I oIoioOli1II0000O = I0000O();
/* 13 */            Ooo00oi0O ooo00oi0O = oIoioOli1II0000O instanceof Ooo00oi0O ? (Ooo00oi0O) oIoioOli1II0000O : null;
/* 14 */            if (ooo00oi0O != null && !ooo00oi0O.I010l10O().I001lloI()) {
/* 28 */                OI1Iio0ii1 name = ooo00oi0O.getName();
/* 34 */                if (!name.I00iiI) {
/* 37 */                    return name.I00000oOI();
                        }
                    }
/* 7 */             return null;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00iiI) + (this.I00iOIl.hashCode() * 31);
                }

                public final String toString() throws IOException {
                    String string;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             int iOrdinal = this.I00iiO.ordinal();
/* 13 */            if (iOrdinal == 0) {
/* 90 */                sb.append("instance parameter");
                    } else if (iOrdinal == 1) {
/* 84 */                sb.append("context parameter " + getName());
                    } else if (iOrdinal == 2) {
/* 62 */                sb.append("extension receiver parameter");
                    } else {
/* 22 */                if (iOrdinal != 3) {
/* 56 */                    I000II.I00000oIO();
/* 12 */                    return null;
                        }
/* 52 */                sb.append("parameter #" + this.I00iiI + ' ' + getName());
                    }
/* 95 */            sb.append(" of ");
/* 98 */            O0O0iOl1l o0O0iOl1l = this.I00iOIl;
/* 105 */           if (o0O0iOl1l instanceof O0O00I1Ili) {
/* 107 */               O0O00I1Ili o0O00I1Ili = (O0O00I1Ili) o0O0iOl1l;
/* 111 */               StringBuilder sb2 = new StringBuilder();
/* 114 */               Io1Oioii1111.I0001Ioi1lo(sb2, o0O00I1Ili);
/* 126 */               sb2.append(o0O00I1Ili instanceof O0Io0ii ? "var " : "val ");
/* 129 */               Io1Oioii1111.I000O01llI0(sb2, o0O00I1Ili);
/* 136 */               Io1Oioii1111.I000II(sb2, o0O00I1Ili.getName());
/* 139 */               sb2.append(": ");
/* 150 */               sb2.append(Io1Oioii1111.I000lI(o0O00I1Ili.I0001Ioi1lo(), false));
/* 153 */               string = sb2.toString();
                    } else {
/* 160 */               if (!(o0O0iOl1l instanceof O0Iill)) {
/* 232 */                   IOOlIIilOl0.I000lI("Illegal callable: ", o0O0iOl1l);
/* 12 */                    return null;
                        }
/* 162 */               O0Iill o0Iill = (O0Iill) o0O0iOl1l;
/* 166 */               StringBuilder sb3 = new StringBuilder();
/* 169 */               Io1Oioii1111.I0001Ioi1lo(sb3, o0Iill);
/* 174 */               sb3.append("fun ");
/* 177 */               Io1Oioii1111.I000O01llI0(sb3, o0Iill);
/* 184 */               Io1Oioii1111.I000II(sb3, o0Iill.getName());
/* 201 */               IOOi0Ool1i.I00IioO0OiOi(l0OoioOl1l0.I00000oIO(o0Iill), sb3, ", ", "(", ")", OOo1l011.I00ilI0I1, 48);
/* 204 */               sb3.append(": ");
/* 215 */               sb3.append(Io1Oioii1111.I000lI(o0Iill.I0001Ioi1lo(), false));
/* 218 */               string = sb3.toString();
                    }
/* 222 */           sb.append(string);
/* 225 */           return sb.toString();
                }
            }
