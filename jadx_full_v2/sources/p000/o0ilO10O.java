            package p000;

            import android.content.Context;
            import android.util.Log;
            import android.util.Pair;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.TreeMap;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.regex.Matcher;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class o0ilO10O {
                public static final ExecutorService I000iOII = Executors.newSingleThreadExecutor();
                public static final ExecutorService I000l1 = Executors.newSingleThreadExecutor();
                public static final long I000lI = 43200;
                public static o0ilO10O I000o00OoI0I;
                public final ExecutorService I00000oIO;
                public final ExecutorService I00000oOI;
                public final o01l1ioOo0 I0000Il00O;
                public final o0iIO0oO0O00 I0000O;
                public volatile iiiiIIllo I0000oI00;
                public volatile iiiiIIllo I0001Ioi1lo;
                public final TreeMap I000II = new TreeMap();
                public final o0lI0IiIl I000O01llI0;
                public final o0l101oi1li1 I000OOo1O;
                public String I000OiO;

                public o0ilO10O(Context context, o01l1ioOo0 o01l1iooo0, o0l101oi1li1 o0l101oi1li1Var, I0i0io0oOOi i0i0io0oOOi) {
/* 11 */            context.getApplicationContext();
/* 14 */            this.I0000Il00O = o01l1iooo0;
/* 18 */            this.I00000oIO = I000iOII;
/* 22 */            this.I00000oOI = I000l1;
/* 24 */            this.I000OOo1O = o0l101oi1li1Var;
/* 28 */            i0i0io0oOOi.getClass();
/* 31 */            String str = i0i0io0oOOi.I00iiI;
/* 33 */            o0iIO0oO0O00 o0iio0oo0o00 = new o0iIO0oO0O00();
/* 36 */            o0iio0oo0o00.I00000oIO = context;
/* 38 */            o0iio0oo0o00.I00000oOI = str;
/* 44 */            Matcher matcher = o0iIO0oO0O00.I0000oI00.matcher("1:722550545529:android:82c62205f0ef0ea96608a8");
/* 61 */            o0iio0oo0o00.I0000Il00O = matcher.matches() ? matcher.group(1) : null;
/* 63 */            o0iio0oo0o00.I0000O = o0l101oi1li1Var;
/* 65 */            VarHandle.storeStoreFence();
/* 68 */            this.I0000O = o0iio0oo0o00;
/* 75 */            this.I000O01llI0 = new o0lI0IiIl(context);
                }

                public static iiiiIIllo I0000Il00O(JSONObject jSONObject) throws JSONException {
                    String string;
/* 6 */             I00Ol00 i00Ol00 = new I00Ol00(17, (short) 0);
/* 13 */            i00Ol00.I0000Il00O = new Object[8];
/* 15 */            i00Ol00.I00000oOI = 0;
/* 17 */            Iterator<String> itKeys = jSONObject.keys();
/* 25 */            while (itKeys.hasNext()) {
/* 27 */                String next = itKeys.next();
                        try {
/* 33 */                    String string2 = jSONObject.getString(next);
/* 38 */                    if (string2 == null) {
/* 40 */                        string = null;
                            } else if (string2.isEmpty()) {
/* 48 */                        string = "";
                            } else {
/* 82 */                        string = new JSONObject("{ \"value\": " + string2 + " }").getString("value");
                            }
/* 88 */                    int i = i00Ol00.I00000oOI + 1;
/* 92 */                    Object[] objArrCopyOf = (Object[]) i00Ol00.I0000Il00O;
/* 94 */                    int length = objArrCopyOf.length;
/* 95 */                    int i2 = i + i;
/* 96 */                    if (i2 > length) {
/* 102 */                       objArrCopyOf = Arrays.copyOf(objArrCopyOf, I00IOO.I000iOII(length, i2));
/* 106 */                       i00Ol00.I0000Il00O = objArrCopyOf;
                            }
/* 108 */                   if (next == null) {
/* 153 */                       IOOlIIilOl0.I000II("null key in entry: null=".concat(String.valueOf(string)));
/* 37 */                        return null;
                            }
/* 110 */                   if (string == null) {
/* 139 */                       IOOlIIilOl0.I000II(IlIi0I0.I000lI("null value in entry: ", next.toString(), "=null"));
/* 37 */                        return null;
                            }
/* 112 */                   int i3 = i00Ol00.I00000oOI;
/* 114 */                   int i4 = i3 + i3;
/* 116 */                   objArrCopyOf[i4] = next;
/* 120 */                   objArrCopyOf[i4 + 1] = string;
/* 124 */                   i00Ol00.I00000oOI = i3 + 1;
                        } catch (JSONException e) {
/* 178 */                   Log.e("MLKit RemoteConfigRestC", "Getting JSON string value for remote config key " + next + " failed", e);
/* 181 */                   throw e;
                        }
                    }
/* 184 */           ii0O00I10 ii0o00i10 = (ii0O00I10) i00Ol00.I0000O;
/* 186 */           if (ii0o00i10 != null) {
/* 437 */               throw ii0o00i10.I00000oIO();
                    }
/* 194 */           iiiiIIllo iiiiiilloI00000oOI = iiiiIIllo.I00000oOI(i00Ol00.I00000oOI, (Object[]) i00Ol00.I0000Il00O, i00Ol00);
/* 200 */           ii0O00I10 ii0o00i102 = (ii0O00I10) i00Ol00.I0000O;
/* 202 */           if (ii0o00i102 == null) {
/* 204 */               return iiiiiilloI00000oOI;
                    }
/* 209 */           throw ii0o00i102.I00000oIO();
                }

                public final o0IiOl I00000oIO() {
/* 3 */             o01oIol1O o01oiol1o = new o01oIol1O();
/* 6 */             o01oiol1o.I0000Il00O();
/* 11 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 18 */            O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(23);
/* 21 */            o10oO1IiI1.I00iiI = this;
/* 23 */            o10oO1IiI1.I00iiO = o01oiol1o;
/* 25 */            o10oO1IiI1.I00iio = oloIlI0ll;
/* 27 */            VarHandle.storeStoreFence();
/* 32 */            this.I00000oIO.execute(o10oO1IiI1);
/* 35 */            return oloIlI0ll.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Pair I00000oOI(o01oIol1O o01oiol1o, boolean z) {
                    o0i1ol0 o0i1ol0Var;
                    JSONObject jSONObject;
/* 1 */             o0lI0IiIl o0li0iiil = this.I000O01llI0;
/* 3 */             o0li0iiil.getClass();
                    synchronized (o0lI0IiIl.I00000oOI) {
/* 13 */                File fileI00000oOI = o0li0iiil.I00000oOI();
                        try {
/* 35 */                    String str = new String(new IoIlOo1o0IIl(fileI00000oOI).I00IlilI0i0i(), Charset.forName("UTF-8"));
                            try {
/* 40 */                        jSONObject = new JSONObject(str);
                            } catch (JSONException e) {
/* 105 */                       o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_READ_RETURNED_MALFORMED_DATA);
/* 116 */                       Log.e("MLKitRemoteConfigSaver", "Error parsing remote config settings JSON string:\n".concat(str), e);
                            }
                        } catch (IOException e2) {
/* 127 */                   if (fileI00000oOI.exists()) {
/* 157 */                       o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_READ_FAILED);
/* 178 */                       Log.w("MLKitRemoteConfigSaver", "Error reading remote config settings file: " + fileI00000oOI.toString(), e2);
                            } else {
/* 147 */                       Log.i("MLKitRemoteConfigSaver", "remote config settings file not yet present: " + fileI00000oOI.toString());
                            }
/* 151 */                   o0i1ol0Var = null;
                        }
                        try {
/* 68 */                    o0i1ol0Var = new o0i1ol0(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
                        } catch (JSONException e3) {
/* 80 */                    o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_READ_RETURNED_INVALID_DATA);
/* 95 */                    Log.e("MLKitRemoteConfigSaver", "Error parsing remote config settings JSON object:\n".concat(jSONObject.toString()), e3);
/* 98 */                    o0i1ol0Var = null;
/* 183 */                   if (o0i1ol0Var != null) {
                            }
                        }
                    }
/* 183 */           if (o0i1ol0Var != null) {
/* 17 */                return null;
                    }
/* 186 */           JSONObject jSONObject2 = o0i1ol0Var.I00000oOI;
                    try {
/* 188 */               iiiiIIllo iiiiiilloI0000Il00O = I0000Il00O(jSONObject2);
/* 192 */               this.I0001Ioi1lo = iiiiiilloI0000Il00O;
/* 194 */               if (z) {
/* 198 */                   o01oIol1O o01oiol1o2 = new o01oIol1O();
/* 201 */                   o01oiol1o2.I0000Il00O();
/* 206 */                   this.I0000oI00 = this.I0001Ioi1lo;
/* 208 */                   o01oiol1o2.I00000oOI();
/* 211 */                   o0l101oi1li1 o0l101oi1li1Var = this.I000OOo1O;
/* 213 */                   o0l101oi1li1Var.getClass();
/* 218 */                   o0l101oi1li1Var.I0001Ioi1lo(lioiiIOoil.REMOTE_CONFIG_ACTIVATE, o01oiol1o2);
                        }
/* 222 */               o01oiol1o.I000II = true;
/* 226 */               return Pair.create(iiiiiilloI0000Il00O, o0i1ol0Var.I0000Il00O);
                    } catch (JSONException e4) {
/* 236 */               o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_READ_RETURNED_MALFORMED_DATA);
/* 251 */               Log.e("MLKit RemoteConfigRestC", "Saved remote config setting has invalid format: ".concat(String.valueOf(jSONObject2)), e4);
/* 17 */                return null;
                    }
                }
            }
