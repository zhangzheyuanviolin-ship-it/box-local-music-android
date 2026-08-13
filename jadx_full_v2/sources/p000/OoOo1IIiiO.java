            package p000;

            import android.graphics.RuntimeShader;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.GenericDeclaration;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OoOo1IIiiO {
                public static final void I00000oIO(long j, int i, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
/* 10 */            iloI0lOlll1.I00i0O(1053441125);
/* 15 */            if ((i2 & 6) == 0) {
/* 26 */                i3 = i2 | (iloI0lOlll1.I0001Ioi1lo(j) ? 4 : 2);
                    } else {
/* 29 */                i3 = i2;
                    }
/* 33 */            if ((i2 & 48) == 0) {
/* 46 */                i3 |= iloI0lOlll1.I0000oI00(i) ? 32 : 16;
                    }
/* 47 */            int i4 = i3 | 384;
/* 64 */            if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 147) != 146)) {
/* 69 */                iloI0lOlll1.I00i01iIIliI(-261266660);
/* 72 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 76 */                Object obj = IOl11li.I00000oIO;
/* 78 */                if (objI00O0i0ii == obj) {
/* 84 */                    objI00O0i0ii = new RuntimeShader("\n// The size of the render area.\nuniform float2 iResolution;\n// The color of the background to render the wave on.\nuniform vec4 bgColor;\n// Current timestamp in seconds.\nuniform float iTime;\n// The amplitude of the sound to be visualized.\n// From 0 to 1.\nuniform float amplitude;\n// The extra offset for 1d perlin noise.\nuniform float pOffset;\n\n// Creates a gradient that blends four different colors based on a uv coordinate and animated\n// over time.\nvec3 mix4(vec3 color1, vec3 color2, vec3 color3, vec3 color4, vec2 uv){\n  float sinTime1 = sin(iTime / 1.6);\n  float sinTime2 = sin(iTime / 1.8);\n  return mix(\n    mix(color1, color2, smoothstep(0.0 + sinTime1 * 0.1, 0.24 + sinTime1 * 0.1, uv.y)),\n    mix(color3, color4, smoothstep(-0.16 - sinTime2 * 0.1, 0.24 - sinTime2 * 0.1, uv.y)),\n    smoothstep(0.0, 0.7 + sinTime1 * 0.1, uv.x));\n}\n\nfloat hash(float i) {\n\tfloat h = i * 127.1;\n\tfloat p = -1. + 2. * fract(sin(h) * 43758.1453123);\n  return p;\n}\n\nfloat perlin_noise_1d(float d) {\n  float i = floor(d);\n  float f = d - i;\n\n  float y = f*f*f* (6. * f*f - 15. * f + 10.);\n\n  float slope1 = hash(i);\n  float slope2 = hash(i + 1.0);\n  float v1 = f;\n  float v2 = f - 1.0;\n\n  float r = mix(slope1 * v1, slope2 * v2, y);\n  r = r * 0.5 + 0.5;\n  return r;\n}\n\nhalf4 main(float2 fragCoord) {\n  float2 uv = fragCoord/iResolution.xy;\n  uv.y = 1.0 - uv.y;\n\n  // Add a wavy distortion to the y-coordinate of the uv.\n  //\n  // Control the amplitude of the wave\n  float wave_strength = 0.036;\n  // Control the speed of the wave\n  float wave_speed = 1.2;\n  // Control the frequency of the wave\n  float wave_frequency = 4.0;\n\n  // Idle.\n  if (amplitude == 0.) {\n    uv.y += sin(uv.x * wave_frequency + -iTime * wave_speed) * wave_strength;\n  }\n  // Visualizing amplitude by sampling the 1d perlin noise at the given offset.\n  else {\n    uv.y -= perlin_noise_1d(pOffset + uv.x * 3.) * amplitude / 2.0;\n  }\n\n  vec3 col = mix4(\n    vec3(0.992, 0.875, 0.522),  // yellow\n    vec3(0.627, 0.816, 0.686),  // green\n    vec3(0.886, 0.372, 0.341),  // red\n    vec3(0.522, 0.694, 0.973),  // blue\n    uv);\n\n  // Define the fade parameters\n  float fade_start = 0.24;\n  float fade_end = 0.34;\n\n  // Calculate the blend factor using smoothstep for a smooth transition\n  float fade_factor = smoothstep(fade_start, fade_end, uv.y);\n\n  // Blend the base color with background color using the fade factor\n  vec4 final_color = mix(vec4(col, 1.0), bgColor, fade_factor);\n\n  return vec4(half3(final_color.xyz) * (1 + amplitude * 0.2), final_color.a);\n}\n");
/* 87 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 90 */                RuntimeShader runtimeShader = (RuntimeShader) objI00O0i0ii;
/* 92 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 96 */                if (objI00O0i0ii2 == obj) {
/* 100 */                   objI00O0i0ii2 = new III11lloi(runtimeShader);
/* 103 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 106 */               OioIoiOi oioIoiOi = (OioIoiOi) objI00O0i0ii2;
/* 108 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 113 */               if (objI00O0i0ii3 == obj) {
/* 117 */                   objI00O0i0ii3 = new OIooO1iiliI(0.0f);
/* 120 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 123 */               OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) objI00O0i0ii3;
/* 125 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 129 */               if (objI00O0i0ii4 == obj) {
/* 133 */                   objI00O0i0ii4 = new OIooO1iiliI(0.0f);
/* 136 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 139 */               OIooO1iiliI oIooO1iiliI2 = (OIooO1iiliI) objI00O0i0ii4;
/* 141 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 145 */               if (objI00O0i0ii5 == obj) {
/* 151 */                   objI00O0i0ii5 = new OIooO00(0.0d);
/* 154 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 157 */               OIooO00 oIooO00 = (OIooO00) objI00O0i0ii5;
/* 171 */               double dPow = Math.pow(i / 32767.0d, 0.5d);
/* 175 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 179 */               if (objI00O0i0ii6 == obj) {
/* 184 */                   Object oIooO1iiliI3 = new OIooO1iiliI((float) dPow);
/* 187 */                   iloI0lOlll1.I00iio(oIooO1iiliI3);
/* 190 */                   objI00O0i0ii6 = oIooO1iiliI3;
                        }
/* 191 */               OIooO1iiliI oIooO1iiliI4 = (OIooO1iiliI) objI00O0i0ii6;
/* 193 */               Integer numValueOf = Integer.valueOf(i);
/* 197 */               boolean zI0000Il00O = iloI0lOlll1.I0000Il00O(dPow);
/* 201 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 207 */               IOoil1iiIilo iOoil1iiIilo = null;
/* 208 */               if (zI0000Il00O || objI00O0i0ii7 == obj) {
/* 214 */                   objI00O0i0ii7 = new I1i1iiI1Oo1i(dPow, oIooO1iiliI4, null);
/* 217 */                   iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 222 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii7, iloI0lOlll1, numValueOf);
/* 225 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 229 */               if (objI00O0i0ii8 == obj) {
/* 234 */                   objI00O0i0ii8 = new I0II0OiI(oIooO1iiliI, iOoil1iiIilo, 3);
/* 237 */                   iloI0lOlll1.I00iio(objI00O0i0ii8);
                        }
/* 244 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii8, iloI0lOlll1, OoiIlOl1iI.I00000oIO);
/* 247 */               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 271 */               boolean zI0000Il00O2 = iloI0lOlll1.I0000Il00O(dPow) | iloI0lOlll1.I000OOo1O(runtimeShader) | ((i4 & 14) == 4);
/* 273 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii9;
/* 277 */               if (zI0000Il00O2 || objI00O0i0ii9 == obj) {
/* 283 */                   I1i1Il1oOiII i1i1Il1oOiII = new I1i1Il1oOiII();
/* 286 */                   i1i1Il1oOiII.I00iOIl = dPow;
/* 288 */                   i1i1Il1oOiII.I00iiI = runtimeShader;
/* 290 */                   i1i1Il1oOiII.I00iiO = j;
/* 292 */                   i1i1Il1oOiII.I00iio = oioIoiOi;
/* 294 */                   i1i1Il1oOiII.I00ilI0I1 = oIooO00;
/* 296 */                   i1i1Il1oOiII.I00ilO0 = oIooO1iiliI2;
/* 298 */                   i1i1Il1oOiII.I00io1l = oIooO1iiliI;
/* 300 */                   i1i1Il1oOiII.I00ioIO = oIooO1iiliI4;
/* 302 */                   VarHandle.storeStoreFence();
/* 305 */                   iloI0lOlll1.I00iio(i1i1Il1oOiII);
                            obj2 = i1i1Il1oOiII;
                        }
/* 311 */               iOl0ilO1.I00000oIO(ilIl1Io0lii1, (Function1) obj2, iloI0lOlll1, 0);
/* 314 */               iloI0lOlll1.I0010I0i(false);
/* 317 */               o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                    } else {
/* 320 */               iloI0lOlll1.I00OilO00Il();
/* 323 */               o1ooiI111i2 = o1ooiI111i;
                    }
/* 325 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 329 */           if (oOloioIlI001IO000 != null) {
/* 333 */               I1i1OI1I1 i1i1OI1I1 = new I1i1OI1I1();
/* 336 */               i1i1OI1I1.I00iOIl = j;
/* 338 */               i1i1OI1I1.I00iiI = i;
/* 340 */               i1i1OI1I1.I00iiO = o1ooiI111i2;
/* 344 */               i1i1OI1I1.I00iio = i2;
/* 346 */               VarHandle.storeStoreFence();
/* 349 */               oOloioIlI001IO000.I0000O = i1i1OI1I1;
                    }
                }

                public static final Type I00000oOI(O0O01O0o o0O01O0o, boolean z) {
/* 1 */             O0IiIl0il o0IiIl0ilI001IIilI0O = o0O01O0o.I001IIilI0O();
/* 10 */            if (o0IiIl0ilI001IIilI0O instanceof O0O0OIOO) {
/* 14 */                if (!(o0IiIl0ilI001IIilI0O instanceof OoOOlOlI)) {
/* 20 */                    OIOioii00Io oIOioii00Io = new OIOioii00Io();
/* 23 */                    oIOioii00Io.I00iOIl = (O0O0OIOO) o0IiIl0ilI001IIilI0O;
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    return oIOioii00Io;
                        }
/* 29 */                OoOOlOlI ooOOlOlI = (OoOOlOlI) o0IiIl0ilI001IIilI0O;
/* 37 */                GenericDeclaration genericDeclaration = (GenericDeclaration) ooOOlOlI.I00iiI.getValue();
/* 39 */                if (genericDeclaration == null) {
/* 89 */                    OoOil11Ol1o.I000iOII("javaType is not supported for this type: ", o0O01O0o);
/* 7 */                     return null;
                        }
/* 46 */                TypeVariable<?> typeVariable = null;
/* 47 */                boolean z2 = false;
/* 48 */                for (TypeVariable<?> typeVariable2 : genericDeclaration.getTypeParameters()) {
/* 62 */                    if (O0000Ioio00.I0000O(typeVariable2.getName(), ooOOlOlI.I00iiO)) {
/* 64 */                        if (z2) {
/* 71 */                            I000II.I000iOII("Array contains more than one matching element.");
/* 7 */                             return null;
                                }
/* 66 */                        z2 = true;
/* 67 */                        typeVariable = typeVariable2;
                            }
                        }
/* 78 */                if (z2) {
/* 80 */                    return typeVariable;
                        }
/* 83 */                OIiilo1Ool0o.I000II("Array contains no element matching the predicate.");
/* 7 */                 return null;
                    }
/* 95 */            if (!(o0IiIl0ilI001IIilI0O instanceof O0IOli0o0)) {
/* 213 */               OoOil11Ol1o.I000iOII("Unsupported type classifier: ", o0O01O0o);
/* 7 */                 return null;
                    }
/* 97 */            O0IOli0o0 o0IOli0o0 = (O0IOli0o0) o0IiIl0ilI001IIilI0O;
/* 108 */           Class clsI00000oOI = z ? l0O00Ol.I00000oOI(o0IOli0o0) : ((IOIO10iOi1) o0IOli0o0).I001l0I00();
/* 112 */           List listI00111O = o0O01O0o.I00111O();
/* 120 */           if (listI00111O.isEmpty()) {
/* 199 */               return clsI00000oOI;
                    }
/* 127 */           if (!clsI00000oOI.isArray()) {
/* 206 */               return I0000Il00O(clsI00000oOI, listI00111O);
                    }
/* 137 */           if (clsI00000oOI.getComponentType().isPrimitive()) {
/* 199 */               return clsI00000oOI;
                    }
/* 144 */           O0O0o1io o0O0o1io = (O0O0o1io) IOOi0Ool1i.I00Ol00(listI00111O);
/* 146 */           if (o0O0o1io == null) {
/* 202 */               IioIoO10iOiI.I000OiO("kotlin.Array must have exactly one type argument: ", o0O01O0o);
/* 7 */                 return null;
                    }
/* 148 */           O0O10O o0o10o = o0O0o1io.I00000oIO;
/* 150 */           O0O01O0o o0O01O0o2 = o0O0o1io.I00000oOI;
/* 163 */           int i = o0o10o == null ? -1 : OoOlooioi0.I00000oIO[o0o10o.ordinal()];
/* 165 */           if (i == -1 || i == 1) {
/* 199 */               return clsI00000oOI;
                    }
/* 170 */           if (i != 2 && i != 3) {
/* 176 */               I000II.I00000oIO();
/* 7 */                 return null;
                    }
/* 180 */           Type typeI00000oOI = I00000oOI(o0O01O0o2, false);
/* 186 */           if (typeI00000oOI instanceof Class) {
/* 199 */               return clsI00000oOI;
                    }
/* 191 */           Io010I io010I = new Io010I();
/* 194 */           io010I.I00iOIl = typeI00000oOI;
/* 196 */           VarHandle.storeStoreFence();
/* 199 */           return io010I;
                }

                public static final OIol0lol I0000Il00O(Class cls, List list) {
/* 1 */             Class<?> declaringClass = cls.getDeclaringClass();
/* 7 */             if (declaringClass == null) {
/* 9 */                 List list2 = list;
/* 17 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 20 */                Iterator it = list2.iterator();
/* 28 */                while (it.hasNext()) {
/* 40 */                    arrayList.add(I0000O((O0O0o1io) it.next()));
                        }
/* 47 */                return new OIol0lol(cls, null, arrayList);
                    }
/* 59 */            if (Modifier.isStatic(cls.getModifiers())) {
/* 61 */                List list3 = list;
/* 69 */                ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 72 */                Iterator it2 = list3.iterator();
/* 80 */                while (it2.hasNext()) {
/* 92 */                    arrayList2.add(I0000O((O0O0o1io) it2.next()));
                        }
/* 98 */                return new OIol0lol(cls, declaringClass, arrayList2);
                    }
/* 106 */           int length = cls.getTypeParameters().length;
/* 115 */           OIol0lol oIol0lolI0000Il00O = I0000Il00O(declaringClass, list.subList(length, list.size()));
/* 120 */           List listSubList = list.subList(0, length);
/* 132 */           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(listSubList, 10));
/* 135 */           Iterator it3 = listSubList.iterator();
/* 143 */           while (it3.hasNext()) {
/* 155 */               arrayList3.add(I0000O((O0O0o1io) it3.next()));
                    }
/* 161 */           return new OIol0lol(cls, oIol0lolI0000Il00O, arrayList3);
                }

                public static final Type I0000O(O0O0o1io o0O0o1io) {
/* 1 */             O0O10O o0o10o = o0O0o1io.I00000oIO;
/* 3 */             if (o0o10o == null) {
/* 5 */                 return i001oIOI.I00iiO;
                    }
/* 8 */             O0O01O0o o0O01O0o = o0O0o1io.I00000oOI;
/* 10 */            int iOrdinal = o0o10o.ordinal();
/* 15 */            if (iOrdinal == 0) {
/* 47 */                return I00000oOI(o0O01O0o, true);
                    }
/* 18 */            if (iOrdinal == 1) {
/* 43 */                return new i001oIOI(null, I00000oOI(o0O01O0o, true));
                    }
/* 21 */            if (iOrdinal == 2) {
/* 29 */                return new i001oIOI(I00000oOI(o0O01O0o, true), null);
                    }
/* 33 */            I000II.I00000oIO();
/* 17 */            return null;
                }

                public static final String I0000oI00(Type type) {
/* 3 */             if (!(type instanceof Class)) {
/* 78 */                return type.toString();
                    }
/* 6 */             Class cls = (Class) type;
/* 12 */            if (!cls.isArray()) {
/* 73 */                return cls.getName();
                    }
/* 16 */            OilO0iOl oilO0iOlI000OiO = OilO1oiooiII.I000OiO(type, OoOo0l1oiIO.I00ioIO);
/* 32 */            StringBuilder sb = new StringBuilder(((Class) OilO1oiooiII.I000l1(oilO0iOlI000OiO)).getName());
/* 35 */            Iterator it = oilO0iOlI000OiO.iterator();
/* 39 */            int i = 0;
/* 44 */            while (it.hasNext()) {
/* 46 */                it.next();
/* 49 */                i++;
/* 51 */                if (i < 0) {
/* 54 */                    IOOi1I.I000l1();
/* 58 */                    throw null;
                        }
                    }
/* 65 */            sb.append(OlOolloIIOl0.I000OiO(i, "[]"));
/* 68 */            return sb.toString();
                }
            }
