package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	/** Le modèle de format par défaut pour les dates. */
	private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

	/**
	 * Formate une date en utilisant un modèle de format personnalisé.
	 *
	 * @param pattern Le modèle de format à utiliser.
	 * @param date    La date à formater.
	 * @return La date formatée sous forme de chaîne de caractères.
	 */
	public static String format(String pattern, Date date) {
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formaterDate(formateur, date);
	}

	/**
	 * Formate une date en utilisant le modèle de format par défaut.
	 *
	 * @param date La date à formater.
	 * @return La date formatée sous forme de chaîne de caractères en utilisant le
	 *         modèle par défaut.
	 */
	public static String formatDefaut(Date date) {
		SimpleDateFormat formateur = new SimpleDateFormat(DEFAULT_PATTERN);
		return formaterDate(formateur, date);
	}

	/**
	 * Formate une date en utilisant le formateur de date spécifié.
	 *
	 * @param formateur Le formateur de date à utiliser.
	 * @param date      La date à formater.
	 * @return La date formatée sous forme de chaîne de caractères.
	 */
	private static String formaterDate(SimpleDateFormat formateur,
			Date date) {
		return formateur.format(date);
	}
}
