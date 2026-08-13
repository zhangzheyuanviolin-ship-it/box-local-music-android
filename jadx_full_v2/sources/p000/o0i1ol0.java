            package p000;

            import java.util.Date;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class o0i1ol0 {
                public static final int I0000O = 0;
                public final JSONObject I00000oIO;
                public final JSONObject I00000oOI;
                public final Date I0000Il00O;

                static {
/* 5 */             new Date(0L);
                }

                public o0i1ol0(JSONObject jSONObject, Date date, JSONArray jSONArray) throws JSONException {
/* 6 */             JSONObject jSONObject2 = new JSONObject();
/* 11 */            jSONObject2.put("configs_key", jSONObject);
/* 20 */            jSONObject2.put("fetch_time_key", date.getTime());
/* 25 */            jSONObject2.put("abt_experiments_key", jSONArray);
/* 28 */            this.I00000oOI = jSONObject;
/* 30 */            this.I0000Il00O = date;
/* 32 */            this.I00000oIO = jSONObject2;
                }

                public final String toString() {
/* 3 */             return this.I00000oIO.toString();
                }
            }
