            package com.google.android.gms.auth.api.signin;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.List;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.I01OlIoIl;
            import p000.OO00iO;
            import p000.lII0I0I000I;
            import p000.lO0IioIooIl;
            
            @Deprecated
            public class GoogleSignInAccount extends I01OlIoIl implements ReflectedParcelable {
                public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new OO00iO(9);
                public final String I00iOIl;
                public final String I00iiI;
                public final String I00iiO;
                public final String I00iio;
                public final Uri I00ilI0I1;
                public String I00ilO0;
                public final long I00io1l;
                public final String I00ioIO;
                public final List I00l0I0l0lO1;
                public final String I00l0OO0IO;
                public final String I00li1OI;
                public final HashSet I00ll1 = new HashSet();

                public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
/* 11 */            this.I00iOIl = str;
/* 13 */            this.I00iiI = str2;
/* 15 */            this.I00iiO = str3;
/* 17 */            this.I00iio = str4;
/* 19 */            this.I00ilI0I1 = uri;
/* 21 */            this.I00ilO0 = str5;
/* 23 */            this.I00io1l = j;
/* 25 */            this.I00ioIO = str6;
/* 27 */            this.I00l0I0l0lO1 = arrayList;
/* 29 */            this.I00l0OO0IO = str7;
/* 31 */            this.I00li1OI = str8;
                }

                public static GoogleSignInAccount I00000oOI(String str) throws JSONException, NumberFormatException {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 5 */                 return null;
                    }
/* 11 */            JSONObject jSONObject = new JSONObject(str);
/* 16 */            String strOptString = jSONObject.optString("photoUrl");
/* 32 */            Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
/* 39 */            long j = Long.parseLong(jSONObject.getString("expirationTime"));
/* 45 */            HashSet hashSet = new HashSet();
/* 50 */            JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
/* 54 */            int length = jSONArray.length();
/* 59 */            for (int i = 0; i < length; i++) {
/* 71 */                hashSet.add(new Scope(1, jSONArray.getString(i)));
                    }
/* 79 */            String strOptString2 = jSONObject.optString("id");
/* 97 */            String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
/* 112 */           String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
/* 127 */           String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
/* 142 */           String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
/* 157 */           String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
/* 160 */           String string = jSONObject.getString("obfuscatedIdentifier");
/* 166 */           lII0I0I000I.I0000O(string);
/* 175 */           GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
/* 190 */           googleSignInAccount.I00ilO0 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
/* 437 */           return googleSignInAccount;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null) {
/* 56 */                return false;
                    }
/* 4 */             if (obj == this) {
/* 54 */                return true;
                    }
/* 9 */             if (!(obj instanceof GoogleSignInAccount)) {
/* 56 */                return false;
                    }
/* 12 */            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
/* 22 */            if (!googleSignInAccount.I00ioIO.equals(this.I00ioIO)) {
/* 56 */                return false;
                    }
/* 28 */            HashSet hashSet = new HashSet(googleSignInAccount.I00l0I0l0lO1);
/* 33 */            hashSet.addAll(googleSignInAccount.I00ll1);
/* 40 */            HashSet hashSet2 = new HashSet(this.I00l0I0l0lO1);
/* 45 */            hashSet2.addAll(this.I00ll1);
                    return hashSet.equals(hashSet2);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00ioIO.hashCode() + 527;
/* 13 */            HashSet hashSet = new HashSet(this.I00l0I0l0lO1);
/* 18 */            hashSet.addAll(this.I00ll1);
/* 27 */            return (iHashCode * 31) + hashSet.hashCode();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiI);
/* 22 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iiO);
/* 28 */            lO0IioIooIl.I000OiO(parcel, 5, this.I00iio);
/* 34 */            lO0IioIooIl.I000OOo1O(parcel, 6, this.I00ilI0I1, i);
/* 40 */            lO0IioIooIl.I000OiO(parcel, 7, this.I00ilO0);
/* 45 */            lO0IioIooIl.I000oI1ioi(parcel, 8, 8);
/* 50 */            parcel.writeLong(this.I00io1l);
/* 57 */            lO0IioIooIl.I000OiO(parcel, 9, this.I00ioIO);
/* 64 */            lO0IioIooIl.I000o00OoI0I(parcel, 10, this.I00l0I0l0lO1);
/* 71 */            lO0IioIooIl.I000OiO(parcel, 11, this.I00l0OO0IO);
/* 78 */            lO0IioIooIl.I000OiO(parcel, 12, this.I00li1OI);
/* 81 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
