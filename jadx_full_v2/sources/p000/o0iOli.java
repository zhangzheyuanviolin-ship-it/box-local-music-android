            package p000;

            import android.content.Context;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            import org.json.JSONException;
            import org.json.JSONObject;
            
/* 135 */   public final class o0iOli implements Ii00l0i1loO, Oi10loIIo1l, o0l11OO0I0I, OoI0o0oiol0l, I1IiiOO0i0io, I1IioI1l10, OOlo0i0, IIOOlli1, Illill0o, iI0lOI0, ilo1O0Ii, iiIi1oo0Io, IioI1o1 {
                public static o0iOli I00iiI;
                public static o0iOli I00ioIO;
                public final int I00iOIl;
                public static final o0iOli I00iiO = new o0iOli(1);
                public static final o0iOli I00iio = new o0iOli(2);
                public static final o0iOli I00ilI0I1 = new o0iOli(3);
                public static final o0iOli I00ilO0 = new o0iOli(6);
                public static final o0iOli I00io1l = new o0iOli(7);
                public static final o0iOli I00l0I0l0lO1 = new o0iOli(20);
                public static final o0iOli I00l0OO0IO = new o0iOli(21);
                public static final o0iOli I00li1OI = new o0iOli(22);
                public static final o0iOli I00ll1 = new o0iOli(23);
                public static final o0iOli I00lli11 = new o0iOli(25);

                public o0iOli(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static String[] I00000oOI(String... strArr) {
/* 4 */             ArrayList arrayList = new ArrayList(strArr.length);
/* 10 */            for (String str : strArr) {
/* 33 */                arrayList.add("<init>(" + str + ")V");
                    }
/* 45 */            return (String[]) arrayList.toArray(new String[0]);
                }

                public static IOIOill I0000oI00(String str, boolean z) {
                    String strI000iOII;
/* 5 */             int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, '`', 0, 6);
/* 10 */            if (iI001i1O0Ol == -1) {
/* 12 */                iI001i1O0Ol = str.length();
                    }
/* 19 */            int iI001lloI = OlOoOIi0o.I001lloI(str, "/", iI001i1O0Ol, 4);
/* 25 */            String str2 = "";
/* 27 */            if (iI001lloI == -1) {
/* 29 */                strI000iOII = OlOolloIIOl0.I000iOII(str, "`", "");
                    } else {
/* 42 */                String strReplace = str.substring(0, iI001lloI).replace('/', '.');
/* 52 */                strI000iOII = OlOolloIIOl0.I000iOII(str.substring(iI001lloI + 1), "`", "");
/* 56 */                str2 = strReplace;
                    }
/* 69 */            return new IOIOill(new Ill0IO(str2), new Ill0IO(strI000iOII), z);
                }

                public static LinkedHashSet I000II(String str, String... strArr) {
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 8 */             for (String str2 : strArr) {
/* 29 */                linkedHashSet.add(str + '.' + str2);
                    }
/* 37 */            return linkedHashSet;
                }

                public static LinkedHashSet I000OiO(String str, String... strArr) {
/* 14 */            return I000II("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
                }

                public static LinkedHashSet I000iOII(String str, String... strArr) {
/* 14 */            return I000II("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
                }

                public static O1oIIloii0 I000l1(OOOlloIl1Oio oOOlloIl1Oio) {
/* 11 */            int i = oOOlloIl1Oio == null ? -1 : OOi1O1O.I00000oIO[oOOlloIl1Oio.ordinal()];
                    return i != 1 ? i != 2 ? i != 3 ? i != 4 ? O1oIIloii0.I00iiI : O1oIIloii0.I00iiO : O1oIIloii0.I00ilI0I1 : O1oIIloii0.I00iio : O1oIIloii0.I00iiI;
                }

                public static Oi0Oooi I000lI(IIllOioOlolI iIllOioOlolI, IOiOol0 iOiOol0) {
                    IlIIiO ilIIiOI00Io1lO;
/* 5 */             IIloOI iIloOI = new IIloOI(11);
/* 8 */             iIloOI.I00iiI = iIllOioOlolI;
/* 10 */            VarHandle.storeStoreFence();
/* 15 */            List list = (List) iOiOol0.I00ilI0I1;
/* 17 */            iOiOol0.toString();
/* 20 */            iIllOioOlolI.I000iOII();
/* 26 */            l11I11lO.I0000O(3, "ResolvedFeatureGroup");
/* 31 */            Set set = (Set) iOiOol0.I00iio;
/* 38 */            if (set.isEmpty() && list.isEmpty()) {
/* 37 */                return null;
                    }
/* 49 */            List list2 = (List) iOiOol0.I00ilO0;
/* 58 */            if (set.isEmpty() && list.isEmpty()) {
/* 72 */                I000II.I000iOII("Must have at least one required or preferred feature");
/* 37 */                return null;
                    }
/* 79 */            Iterator it = list2.iterator();
                    while (true) {
/* 87 */                if (it.hasNext()) {
/* 93 */                    Ool10o ool10o = (Ool10o) it.next();
/* 97 */                    OolOiI0I.I00iiI.getClass();
/* 106 */                   if (l1I0oI.I0001Ioi1lo(ool10o) == OolOiI0I.I00ioIO) {
/* 110 */                       IlIIOiI1o1 ilIIOiI1o1 = new IlIIOiI1o1();
/* 113 */                       ilIIOiI1o1.I00000oIO = ool10o;
/* 115 */                       VarHandle.storeStoreFence();
                                ilIIiOI00Io1lO = ilIIOiI1o1;
                                break;
                            }
                        } else {
/* 121 */                   Iterator it2 = set.iterator();
                            while (true) {
/* 129 */                       if (it2.hasNext()) {
/* 137 */                           IlIIOlio00io ilIIOlio00ioI00IoIO0lI = IIloOI.I00IoIO0lI((Io1100oIo) it2.next(), list2);
/* 141 */                           if (ilIIOlio00ioI00IoIO0lI != null) {
/* 143 */                               ilIIiOI00Io1lO = ilIIOlio00ioI00IoIO0lI;
                                        break;
                                    }
                                } else {
/* 149 */                           ArrayList arrayList = new ArrayList();
/* 162 */                           for (Object obj : list) {
/* 171 */                               IlIIOlio00io ilIIOlio00ioI00IoIO0lI2 = IIloOI.I00IoIO0lI((Io1100oIo) obj, list2);
/* 175 */                               if (ilIIOlio00ioI00IoIO0lI2 != null) {
/* 177 */                                   ilIIOlio00ioI00IoIO0lI2.toString();
/* 180 */                                   l11I11lO.I0000O(3, "DefaultFeatureGroupResolver");
                                        } else {
/* 184 */                                   ilIIOlio00ioI00IoIO0lI2 = null;
                                        }
/* 185 */                               if (ilIIOlio00ioI00IoIO0lI2 == null) {
/* 187 */                                   arrayList.add(obj);
                                        }
                                    }
/* 191 */                           arrayList.toString();
/* 194 */                           l11I11lO.I0000O(3, "DefaultFeatureGroupResolver");
/* 200 */                           ilIIiOI00Io1lO = iIloOI.I00Io1lO(iOiOol0, arrayList, 0, Il01100l.I00iOIl);
                                }
                            }
                        }
                    }
/* 206 */           if (ilIIiOI00Io1lO instanceof IlIIO0I0l11) {
/* 210 */               Oi0Oooi oi0Oooi = ((IlIIO0I0l11) ilIIiOI00Io1lO).I00000oIO;
/* 212 */               Objects.toString(oi0Oooi);
/* 215 */               l11I11lO.I0000O(3, "ResolvedFeatureGroup");
/* 218 */               return oi0Oooi;
                    }
/* 221 */           if (ilIIiOI00Io1lO instanceof IlIIO1OiIO) {
/* 276 */               I000II.I000iOII("Feature group is not supported");
/* 37 */                return null;
                    }
/* 225 */           if (ilIIiOI00Io1lO instanceof IlIIOiI1o1) {
/* 273 */               throw new IllegalArgumentException(((IlIIOiI1o1) ilIIiOI00Io1lO).I00000oIO + " is not supported");
                    }
/* 229 */           if (!(ilIIiOI00Io1lO instanceof IlIIOlio00io)) {
/* 243 */               I000II.I00000oIO();
/* 37 */                return null;
                    }
/* 231 */           IlIIOlio00io ilIIOlio00io = (IlIIOlio00io) ilIIiOI00Io1lO;
/* 239 */           IoOOl0iOl1io.I000o00OoI0I(" must be added for ", ilIIOlio00io.I00000oIO, ilIIOlio00io.I00000oOI);
/* 37 */            return null;
                }

                public static IOIOill I000o00OoI0I(Ill0IO ill0IO) {
/* 13 */            return new IOIOill(ill0IO.I00000oOI(), ill0IO.I00000oIO.I000II());
                }

                public static synchronized void I000oI1ioi() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new o0iOli(0);
                    }
                }

                @Override
                public float I00000oIO() {
/* 1 */             return 0.0f;
                }

                @Override
                public int I0000Il00O(Context context, String str, boolean z) {
/* 1 */             return IioIii0IO.I0000O(context, str, z);
                }

                @Override
                public int I0000O(Context context, String str) {
/* 1 */             return IioIii0IO.I00000oIO(context, str);
                }

                @Override
                public void I0001Ioi1lo(IiIooOOOI iiIooOOOI, int i, int[] iArr, O0iOOoiioO o0iOOoiioO, int[] iArr2) {
/* 3 */             if (o0iOOoiioO == O0iOOoiioO.I00iOIl) {
/* 6 */                 I1IiooiI1IlO.I0000O(i, iArr, iArr2, false);
                    } else {
/* 11 */                I1IiooiI1IlO.I0000O(i, iArr, iArr2, true);
                    }
                }

                @Override
                public void I000O01llI0(IiIooOOOI iiIooOOOI, int i, int[] iArr, int[] iArr2) {
/* 2 */             I1IiooiI1IlO.I0000O(i, iArr, iArr2, false);
                }

                @Override
                public o0l0iIlo0O I000OOo1O(JSONObject jSONObject) throws JSONException {
/* 29 */            return new i1Ii1ooOII0(jSONObject.getLong("last_access_time"), jSONObject.getString("id"), jSONObject.getString("path"), jSONObject.optString("model_name", "unknown"));
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                        case 7:
                            break;
                        case 16:
/* 12 */                    List list = (List) obj;
/* 14 */                    if (list != null && list.size() > 0) {
                                break;
                            }
                            break;
                        case 17:
                            break;
                    }
/* 6 */             return (byte[]) obj;
                }

                @Override
                public O0iIl1 getType() {
/* 20 */            throw new IllegalStateException("This method should not be called");
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 8:
/* 11 */                    return "Arrangement#SpaceBetween";
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 110 */                   List list = iol1II1ii1i.I00000oIO;
/* 114 */                   iI1lO0li.I00iiI.get();
/* 133 */                   return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.sgtm.google_signal.url", 16, "https://app-measurement.com/s/d").get();
                        case PoseLandmark.LEFT_THUMB:
/* 83 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 87 */                    iI1lO0li.I00iiI.get();
/* 107 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(65, 3600000L, "measurement.upload.interval").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 58 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 62 */                    iIO0i1II.I00iiI.get();
/* 80 */                    return (Long) iIO0o100IO.I00000oIO.I00111O(4, -1L, "measurement.test.long_flag").get();
                        case PoseLandmark.LEFT_HIP:
/* 32 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 36 */                    iI1lO0li.I00iiI.get();
/* 55 */                    return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.rb.attribution.user_properties", 80, "_npa,npa|_fot,fot").get();
                        default:
/* 28 */                    return new Boolean(((Boolean) iIIlIllIoll.I00000oOI.get()).booleanValue());
                    }
                }

                @Override
                public boolean mo33zzb(Class cls) {
/* 1 */             return false;
                }

                @Override
                public iI10oo00io zzc(Class cls) {
/* 29 */            throw new IllegalStateException("This should never be called.");
                }

                @Override
/* 136 */       public iOlI0O0iIiO zza() {
/* 137 */           return iOlI0O0iIiO.I0000Il00O(6, null, "AICore service disconnected");
                }
            }
