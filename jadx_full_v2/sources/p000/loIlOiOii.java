            package p000;

            import java.lang.reflect.Array;
            import java.text.DateFormat;
            import java.text.ParseException;
            import java.text.ParsePosition;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.TimeZone;
            
            public final class loIlOiOii extends llOl001olOi {
                public static final loIiOOlI0oI1 I0000O = new loIiOOlI0oI1(0);
                public static final loIiOOlI0oI1 I0000oI00 = new loIiOOlI0oI1(1);
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public loIlOiOii(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Date] */
                /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Date] */
                @Override
                public final Object I00000oIO(o0IlOioo o0iloioo) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
                    Collection collectionI00000oIO;
/* 6 */             Collection collection = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 243 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 245 */                       o0iloioo.I00lli11();
/* 6 */                         return null;
                            }
/* 251 */                   ArrayList arrayList = new ArrayList();
/* 254 */                   o0iloioo.I00Io1lO();
/* 261 */                   while (o0iloioo.I00Ol00()) {
/* 273 */                       arrayList.add(((o0I100l0o0O) this.I0000Il00O).I00000oOI.I00000oIO(o0iloioo));
                            }
/* 277 */                   o0iloioo.I00IoiI();
/* 280 */                   int size = arrayList.size();
/* 286 */                   Class cls = (Class) this.I00000oOI;
/* 292 */                   if (!cls.isPrimitive()) {
/* 316 */                       return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                            }
/* 294 */                   Object objNewInstance = Array.newInstance((Class<?>) cls, size);
/* 298 */                   for (int i = 0; i < size; i++) {
/* 304 */                       Array.set(objNewInstance, i, arrayList.get(i));
                            }
/* 320 */                   return objNewInstance;
                        case 1:
/* 145 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 147 */                       o0iloioo.I00lli11();
                            } else {
/* 153 */                       ArrayList arrayList2 = (ArrayList) this.I0000Il00O;
/* 155 */                       String strI00ioIO = o0iloioo.I00ioIO();
                                synchronized (arrayList2) {
                                    try {
/* 160 */                               Iterator it = arrayList2.iterator();
                                        while (true) {
/* 168 */                                   if (it.hasNext()) {
/* 174 */                                       DateFormat dateFormat = (DateFormat) it.next();
/* 176 */                                       TimeZone timeZone = dateFormat.getTimeZone();
                                                try {
/* 180 */                                           ?? r8 = dateFormat.parse(strI00ioIO);
/* 184 */                                           dateFormat.setTimeZone(timeZone);
                                                    collectionI00000oIO = r8;
                                                } catch (ParseException unused) {
/* 197 */                                           dateFormat.setTimeZone(timeZone);
                                                } catch (Throwable th) {
/* 193 */                                           dateFormat.setTimeZone(timeZone);
/* 196 */                                           throw th;
                                                }
                                            } else {
                                                try {
/* 207 */                                           collectionI00000oIO = o01Ioi0Oo0.I00000oIO(strI00ioIO, new ParsePosition(0));
                                                } catch (ParseException e) {
/* 236 */                                           throw new llO11IolIO(loill0OOio.I00000oIO((byte) 35, strI00ioIO, o0iloioo, "Failed parsing '", "' as Date; at path "), e, 25);
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
/* 238 */                               throw th2;
                                    }
                                }
/* 188 */                       collection = collectionI00000oIO;
/* 216 */                       ((i1O01Ill) this.I00000oOI).getClass();
                            }
/* 219 */                   return collection;
                        case 2:
/* 97 */                    if (o0iloioo.I00ooIo0() == 9) {
/* 99 */                        o0iloioo.I00lli11();
                            } else {
/* 112 */                       collection = (Collection) ((lo11I0lO) this.I00000oOI).zza();
/* 114 */                       o0iloioo.I00Io1lO();
/* 121 */                       while (o0iloioo.I00Ol00()) {
/* 133 */                           collection.add(((o0I100l0o0O) this.I0000Il00O).I00000oOI.I00000oIO(o0iloioo));
                                }
/* 137 */                       o0iloioo.I00IoiI();
                            }
/* 140 */                   return collection;
                        default:
/* 16 */                    Object objI00000oIO = ((llOl001olOi) this.I0000Il00O).I00000oIO(o0iloioo);
/* 20 */                    if (objI00000oIO != null) {
/* 24 */                        Class cls2 = (Class) this.I00000oOI;
/* 30 */                        if (!cls2.isInstance(objI00000oIO)) {
/* 33 */                            Class<?> cls3 = objI00000oIO.getClass();
/* 39 */                            String name = cls2.getName();
/* 43 */                            String name2 = cls3.getName();
/* 48 */                            String strI00100l0 = o0iloioo.I00100l0(true);
/* 72 */                            StringBuilder sb = new StringBuilder(name2.length() + name.length() + 20 + 10 + strI00100l0.length());
/* 79 */                            IIl001iO0Io.I001lIiIIo1O(sb, "Expected a ", name, " but was ", name2);
/* 91 */                            throw new llO11IolIO(IIl001iO0Io.I00100l0(sb, "; at path ", strI00100l0), 25);
                                }
                            }
/* 92 */                    return objI00000oIO;
                    }
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 1:
/* 20 */                    DateFormat dateFormat = (DateFormat) ((ArrayList) this.I0000Il00O).get(0);
/* 28 */                    if (dateFormat instanceof SimpleDateFormat) {
/* 32 */                        String pattern = ((SimpleDateFormat) dateFormat).toPattern();
/* 48 */                        StringBuilder sb = new StringBuilder(String.valueOf(pattern).length() + 24);
/* 51 */                        sb.append("DefaultDateTypeAdapter(");
/* 54 */                        sb.append(pattern);
/* 57 */                        sb.append(")");
/* 60 */                        return sb.toString();
                            }
/* 69 */                    String simpleName = dateFormat.getClass().getSimpleName();
/* 81 */                    StringBuilder sb2 = new StringBuilder(simpleName.length() + 24);
/* 84 */                    sb2.append("DefaultDateTypeAdapter(");
/* 87 */                    sb2.append(simpleName);
/* 90 */                    sb2.append(")");
/* 93 */                    return sb2.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
