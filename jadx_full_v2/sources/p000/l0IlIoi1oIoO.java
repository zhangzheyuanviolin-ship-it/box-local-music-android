            package p000;

            import android.net.Uri;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public abstract class l0IlIoi1oIoO {
                public static Long I00000oIO(JSONObject jSONObject) {
/* 7 */             if (!jSONObject.has("expires_at") || jSONObject.isNull("expires_at")) {
/* 25 */                return null;
                    }
                    try {
/* 20 */                return Long.valueOf(jSONObject.getLong("expires_at"));
                    } catch (JSONException unused) {
/* 25 */                return null;
                    }
                }

                public static String I00000oOI(JSONObject jSONObject, String str) throws JSONException {
/* 3 */             lII1IoI.I0000Il00O("json must not be null", jSONObject);
/* 12 */            if (!jSONObject.has(str)) {
/* 89 */                throw new JSONException(IlIi0I0.I000lI("field \"", str, "\" not found in json object"));
                    }
/* 14 */            String string = jSONObject.getString(str);
/* 18 */            if (string != null) {
/* 20 */                return string;
                    }
/* 32 */            throw new JSONException(IlIi0I0.I000lI("field \"", str, "\" is mapped to a null value"));
                }

                public static String I0000Il00O(JSONObject jSONObject, String str) {
/* 3 */             lII1IoI.I0000Il00O("json must not be null", jSONObject);
/* 10 */            if (!jSONObject.has(str)) {
/* 12 */                return null;
                    }
/* 14 */            String string = jSONObject.getString(str);
/* 18 */            if (string != null) {
/* 20 */                return string;
                    }
/* 89 */            throw new JSONException(IlIi0I0.I000lI("field \"", str, "\" is mapped to a null value"));
                }

                public static LinkedHashMap I0000O(JSONObject jSONObject, String str) throws JSONException {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 8 */             lII1IoI.I0000Il00O("json must not be null", jSONObject);
/* 15 */            if (jSONObject.has(str)) {
/* 18 */                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
/* 22 */                Iterator<String> itKeys = jSONObject2.keys();
/* 30 */                while (itKeys.hasNext()) {
/* 32 */                    String next = itKeys.next();
/* 38 */                    String string = jSONObject2.getString(next);
/* 44 */                    lII1IoI.I0000Il00O("additional parameter values must not be null", string);
/* 47 */                    linkedHashMap.put(next, string);
                        }
                    }
/* 89 */            return linkedHashMap;
                }

                public static Uri I0000oI00(JSONObject jSONObject, String str) throws JSONException {
/* 3 */             lII1IoI.I0000Il00O("json must not be null", jSONObject);
/* 6 */             String string = jSONObject.getString(str);
/* 10 */            if (string != null) {
/* 12 */                return Uri.parse(string);
                    }
/* 89 */            throw new JSONException(IlIi0I0.I000lI("field \"", str, "\" is mapped to a null value"));
                }

                public static Uri I0001Ioi1lo(JSONObject jSONObject, String str) throws JSONException {
/* 3 */             lII1IoI.I0000Il00O("json must not be null", jSONObject);
/* 10 */            if (!jSONObject.has(str)) {
/* 12 */                return null;
                    }
/* 14 */            String string = jSONObject.getString(str);
/* 18 */            if (string != null) {
/* 20 */                return Uri.parse(string);
                    }
/* 89 */            throw new JSONException(IlIi0I0.I000lI("field \"", str, "\" is mapped to a null value"));
                }

                public static JSONObject I000II(Map map) {
/* 1 */             map.getClass();
/* 6 */             JSONObject jSONObject = new JSONObject();
/* 21 */            for (Map.Entry entry : map.entrySet()) {
/* 37 */                lII1IoI.I0000Il00O("map entries must not have null keys", (String) entry.getKey());
/* 48 */                lII1IoI.I0000Il00O("map entries must not have null values", (String) entry.getValue());
/* 63 */                I000O01llI0(jSONObject, (String) entry.getKey(), (String) entry.getValue());
                    }
/* 186 */           return jSONObject;
                }

                public static void I000O01llI0(JSONObject jSONObject, String str, String str2) {
/* 3 */             lII1IoI.I0000Il00O("field must not be null", str);
/* 8 */             lII1IoI.I0000Il00O("value must not be null", str2);
                    try {
/* 11 */                jSONObject.put(str, str2);
                    } catch (JSONException e) {
/* 18 */                IoOOl0iOl1io.I000l1("JSONException thrown in violation of contract", e);
                    }
                }

                public static void I000OOo1O(JSONObject jSONObject, String str, JSONObject jSONObject2) {
/* 3 */             lII1IoI.I0000Il00O("value must not be null", jSONObject2);
                    try {
/* 6 */                 jSONObject.put(str, jSONObject2);
                    } catch (JSONException e) {
/* 13 */                IoOOl0iOl1io.I000l1("JSONException thrown in violation of contract", e);
                    }
                }

                public static void I000OiO(JSONObject jSONObject, String str, Uri uri) throws JSONException {
/* 1 */             if (uri == null) {
/* 3 */                 return;
                    }
                    try {
/* 8 */                 jSONObject.put(str, uri.toString());
                    } catch (JSONException e) {
/* 15 */                IoOOl0iOl1io.I000l1("JSONException thrown in violation of contract", e);
                    }
                }

                public static void I000iOII(JSONObject jSONObject, String str, String str2) throws JSONException {
/* 1 */             if (str2 == null) {
/* 3 */                 return;
                    }
                    try {
/* 4 */                 jSONObject.put(str, str2);
                    } catch (JSONException e) {
/* 11 */                IoOOl0iOl1io.I000l1("JSONException thrown in violation of contract", e);
                    }
                }

                public static ArrayList I000l1(JSONArray jSONArray) throws JSONException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 11 */            for (int i = 0; i < jSONArray.length(); i++) {
/* 13 */                Object objI000lI = jSONArray.get(i);
/* 19 */                if (objI000lI instanceof JSONArray) {
/* 23 */                    objI000lI = I000l1((JSONArray) objI000lI);
                        } else if (objI000lI instanceof JSONObject) {
/* 34 */                    objI000lI = I000lI((JSONObject) objI000lI);
                        }
/* 38 */                arrayList.add(objI000lI);
                    }
/* 49 */            return arrayList;
                }

                public static HashMap I000lI(JSONObject jSONObject) throws JSONException {
/* 3 */             HashMap map = new HashMap();
/* 6 */             Iterator<String> itKeys = jSONObject.keys();
/* 14 */            while (itKeys.hasNext()) {
/* 16 */                String next = itKeys.next();
/* 22 */                Object objI000lI = jSONObject.get(next);
/* 28 */                if (objI000lI instanceof JSONArray) {
/* 32 */                    objI000lI = I000l1((JSONArray) objI000lI);
                        } else if (objI000lI instanceof JSONObject) {
/* 43 */                    objI000lI = I000lI((JSONObject) objI000lI);
                        }
/* 47 */                map.put(next, objI000lI);
                    }
/* 186 */           return map;
                }
            }
